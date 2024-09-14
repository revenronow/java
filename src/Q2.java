import java.util.*;

public class Q2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Character> a = new ArrayList<Character>();
		
		System.out.print("빈 칸으로 분리하여 5개의 학점을 입력(A/B/C/D/F)>> ");
		for(int i = 0; i < 5; i++) {
			String s = scanner.next();
			char alpha = s.charAt(0);
			a.add(alpha);
		}
	
		for(int i = 0; i < a.size(); i++) {
			if(a.get(i) == 'A')
				System.out.print(4.0);
			else if(a.get(i) == 'B')
				System.out.print(3.0);
			else if(a.get(i) == 'C')
				System.out.print(2.0);
			else if(a.get(i) == 'D')
				System.out.print(1.0);
			else if(a.get(i) == 'F')
				System.out.print(0.0);
			else
				System.out.print("잘못된 입력입니다.");
			
			System.out.print(" ");
		}
	}

}
