import java.util.StringTokenizer;
import java.util.Scanner;

public class TokenEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			String query = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(query, " ");
			
			int n = st.countTokens();
			
			if(query.equals("exit")) {
				System.out.println("종료합니다");
				break;
			} else {
				System.out.println("어절 개수는 " + n +"개");
			}
		} 
	}

}
