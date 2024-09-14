import java.util.*;

public class Q6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> point = new HashMap<String, Integer>();
		
		while(true) {
			System.out.print("이름과 포인트 입력 >> ");
			String name = scanner.next();
			
			if(name.equals("exit")) {
				System.out.print("종료합니다.");
				System.exit(1);
			} else {
				int pt = scanner.nextInt();
				
				if(point.containsKey(name)) {
					point.put(name, point.get(name) + pt);
				} else {
					point.put(name, pt);
				}
			}
			
			Set<String> key = point.keySet();
			Iterator<String> it = key.iterator();
			while(it.hasNext()) {
				String k = it.next();
				int value = point.get(k);
				System.out.print("(" + k + ", " + value + ")");
			}
			
			System.out.println();
		}
	}
}
