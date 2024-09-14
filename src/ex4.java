import java.util.Scanner;
import java.util.StringTokenizer;

public class ex4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		String query = scanner.next();
		StringTokenizer st = new StringTokenizer(query, "+");
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			sum += Integer.parseInt(token);
		}
		
		System.out.println("합은 " + sum);
	}

}
