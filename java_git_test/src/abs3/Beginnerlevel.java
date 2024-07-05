package abs3;

public class Beginnerlevel extends Playerlevel {
  @Override
  public void run() {
	  System.out.println("빨리 달립니다.");
  }
  
  @Override
  public void jump() {
      System.out.println("jump 기능이 해제 되지 않았습니다.");
  }

  @Override
  public void turn() {
      System.out.println("turn 기능이 해제 되지 않았습니다.");
  }

  @Override
  public void showLevelMessage() {
      System.out.println("*****초보자 레벨입니다*****");
  }
}
