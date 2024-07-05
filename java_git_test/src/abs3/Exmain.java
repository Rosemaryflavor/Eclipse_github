package abs3;

public class Exmain {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);

        Advancedlevel aLevel = new Advancedlevel();
        player.upgradeLevel(aLevel);
        player.play(2);

        Superlevel sLevel = new Superlevel();
        player.upgradeLevel(sLevel);
        player.play(3);
    }
}
