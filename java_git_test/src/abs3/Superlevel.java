package abs3;

public class Superlevel extends Playerlevel {
	    @Override
	    public void run() {
	        System.out.println("매우 빨리 달립니다.");
	    }

	    @Override
	    public void jump() {
	        System.out.println("높이 jump!");
	    }

	    @Override
	    public void turn() {
	        System.out.println("크게 turn!");
	    }

	    @Override
	    public void showLevelMessage() {
	        System.out.println("*****고급자 레벨입니다*****");
	    }

}
