package java_05;

public class MainExcecute {

	public static void main(String[] args) {
	  //부모 클래스 생성자
		Point point = new Point(1, 2);
		
		point.setX(10);
		point.setY(20);
		
		System.out.println("point의 x값: " + point.getX());
		System.out.println("point의 y값: " + point.getY());
		
		//자식 클래스 생성자- point class 상속받음
		Circle circle = new Circle(10, 20);
		
		Circle.setX(100);
		Circle.setY(200);
		
		System.out.println("circle의 x값: " + circle.getX());
		System.out.println("circle의 y값: " + circle.getY());
		
		
	}

}
