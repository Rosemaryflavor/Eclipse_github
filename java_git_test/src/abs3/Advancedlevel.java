package abs3;

public class Advancedlevel extends Playerlevel {
    @Override
    public void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("jump!");
    }

    @Override
    public void turn() {
        System.out.println("turn!");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("*****중급자 레벨입니다*****");
    }

}
