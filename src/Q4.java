import java.util.*;

public class Q4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Float> v = new Vector<Float>();
		
		System.out.print("2000~2009년까지 1년 단위로 키(cm)를 입력\n>>");
		for(int i = 0; i < 10; i++) {
			float cm = scanner.nextInt();
			v.add(cm);
		}
		
		float max = 0;
		int max_index = -1;
		for(int i = 0; i < 9; i++) {
			float growth = v.get(i+1) - v.get(i);
			if(growth > max) {
				max = growth;
				max_index = i;
			}
		}
		
		System.out.println("가장 키가 많이 자란 연도는 200" + max_index + "년 " + max + "cm");
	}

}
