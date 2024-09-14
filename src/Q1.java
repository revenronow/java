import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		Vector<Float> v = new Vector<Float>();
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			Float f = scanner.nextFloat();
			v.add(f);
		}
		
		float maxNum = 0;
		for(int i = 0; i < 4; i++) {
			if(v.get(i) > v.get(i+1)) {
				maxNum = v.get(i);
			}
		}
		
		System.out.println("가장 큰 수는 " + maxNum);
	}

}
