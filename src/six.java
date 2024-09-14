import java.util.Scanner;

public class six {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("가위(1), 바위(2), 보(3), 끝내기(4)");
			String x = scanner.next();
			int y = (int)(Math.random() * 3 + 1);
			
			switch(x) {
				case "1":
					System.out.print("사용자 가위 : ");
					if(y==1) {
						System.out.println("컴퓨터 가위\n비겼습니다.");
					} else if(y==2) {
						System.out.println("컴퓨터 바위\n졌습니다.");
					} else {
						System.out.println("컴퓨터 보\n이겼습니다.");
					}
					break;
				case "2":
					System.out.print("사용자 바위 : ");
					if(y==1) {
						System.out.println("컴퓨터 가위\n이겼습니다.");
					} else if(y==2) {
						System.out.println("컴퓨터 바위\n비겼습니다.");
					} else {
						System.out.println("컴퓨터 보\n졌습니다.");
					}
					break;
				case "3":
					System.out.print("사용자 보 : ");
					if(y==1) {
						System.out.println("컴퓨터 가위\n졌습니다.");
					} else if(y==2) {
						System.out.println("컴퓨터 바위\n이겼습니다.");
					} else {
						System.out.println("컴퓨터 보\n비겼습니다.");
					}
					break;
			}
			
			if(x.equals("4")) {
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
	}

}
