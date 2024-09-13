import java.util.Scanner;

abstract class Drawing { // 추상 메서드
	public abstract void draw(); // 상속 시 반드시 재정의해야 하는 추상 메서드
}

class Line extends Drawing {
	public void draw() {
		System.out.println("Line");
	}
}

//class Circle extends Drawing {
//	public void draw() {
//		System.out.println("Circle");
//	}
//}

class Rect extends Drawing {
	public void draw() {
		System.out.println("Rect");
	}
}

class Editor extends Drawing {
	static int i = 0;
	private String draw[] = new String[10];	// 배열 생성
	Scanner scanner = new Scanner(System.in);
	
	public void insert() {
		System.out.print("도형 종류 Line(1), Rect(2), Circle(3)>>");
		int choice = scanner.nextInt();	// 사용자가 입력한 숫자에 맞춰 배열에 문자열 저장
		switch(choice) {
		case 1:
			draw[i++] = "Line";
			break;
		case 2:
			draw[i++] = "Rect";
			break;
		case 3:
			draw[i++] = "Circle";
			break;
		default:
			System.out.print("잘못된 입력입니다.");
		}
	}
	
	public void remove() {
		System.out.print("삭제할 도형의 위치>>");
		int idx = scanner.nextInt();
		if(idx <= i) {
			draw[idx--] = null;
		} else
			System.out.println("삭제할 수 없습니다.");
	}
	
	public void draw() {
		for(int k = 0; k < i; k++) {
			System.out.println(draw[k]);
		}
	}
}

public class GraphicEditor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Editor editor = new Editor();
		
		while(true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
				editor.insert();
				break;
			case 2:
				editor.remove();
				break;
			case 3:
				editor.draw();
				break;
			case 4:
				System.out.print("프로그램을 종료합니다");
				System.exit(0);
			default:
				System.out.print("잘못된 입력입니다.");
			}
		}
	}

}
