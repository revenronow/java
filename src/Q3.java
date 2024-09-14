import java.util.*;

public class Q3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		
		System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라떼 있습니다.");
		while(true) {
			System.out.print("주문>> ");
			String s = scanner.next();
			if(s.equals("그만"))
				break;
			else if(s.equals("에스프레소"))
				System.out.println("에스프레소는 2000원입니다.");
			else if(s.equals("아메리카노"))
				System.out.println("아메리카노는 2500원입니다.");
			else if(s.equals("카푸치노"))
				System.out.println("카푸치노는 3000원입니다.");
			else if(s.equals("카페라떼"))
				System.out.println("카페라떼는 3500원입니다.");
		}
	}

}
