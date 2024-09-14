public class RandomEx {
	public static void main(String[] args) {
		
		while(true) {
			int a = (int)(Math.random() * 3 + 1);
			int b = (int)(Math.random() * 3 + 1);
			int c = (int)(Math.random() * 3 + 1);
			System.out.println(a + " " + b + " " + c);
			if(a == b && b == c && a == c) {
				System.out.println("성공");
				break;
			}
		}
	}
}
