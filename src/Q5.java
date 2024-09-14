import java.util.*;

public class Q5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		
		System.out.println("나라 이름과 인구 5개를 입력하세요.");
		for(int i = 0; i < 5; i++) {
			System.out.print("나라 이름, 인구 >> ");
			nations.put(scanner.next(), scanner.nextInt());
		}
		
		
		String max_nation = null;
		int max_people = 0;
		Set<String> keys = nations.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			if(nations.get(key) > max_people) {
				max_nation = key;
				max_people = nations.get(key);
			}
		}
		
		System.out.print("제일 인구가 많은 나라는 (" + max_nation + ", " + max_people + ")");
	}

}
