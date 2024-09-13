interface Shape {
	final double PI = 3.14;	// 상수: 값 참조
	void draw();	// 추상 메소드(인터페이스 참조 시 강제 재구현)
	double getArea();	// 추상 메소드(인터페이스 참조 시 강제 재구현)
	default public void redraw() {	// 인터페이스 기본 제공, 수정 가능(선택적)
		System.out.println("---다시 그립니다.---");
		draw();
	}
}

class Circle implements Shape {
	public int radius;	// 반지름
	public Circle(int radius) {	// 매개변수를 가진 생성자
		this.radius = radius;
	}
	
	public void draw() {	// 추상 메소드 draw() 재정의
		System.out.print("반지름 " + this.radius + " ");
	}
	
	public double getArea() { // 추상 메소드 getArea() 재정의
		return PI * radius * radius;
	}
}

public class ShapeApp {

	public static void main(String[] args) {
		Shape coin = new Circle(10);	//  Circle 객체 생성
		coin.redraw();
		System.out.println("코인의 면적은 " + coin.getArea());
	}

}
