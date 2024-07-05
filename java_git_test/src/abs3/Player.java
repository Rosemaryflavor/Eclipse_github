package abs3;

public class Player {
	
   private Playerlevel level;
   
   public Player() {
	  level = new Beginnerlevel();
	  level.showLevelMessage();
   }
   
   

public Playerlevel getLevel() {
	return this.level;
}

public void upgradeLevel(Playerlevel level) {
	this.level = level;
	level.showLevelMessage();
}

public void play(int count) {
	this.level.go(count);
}
}
