import java.util.*;
import java.lang.Math;

class Location {
	private int x, y;
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}

public class Q7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Location> lc = new ArrayList<Location>();
		
		System.out.println("쥐가 이동한 위치(x, y)를 5개 입력하여라.");
		
		lc.add(new Location(0, 0));
		for(int i = 0; i < 5; i++) {
			System.out.print(">> ");
			lc.add(new Location(scanner.nextInt(), scanner.nextInt()));
		}
		lc.add(new Location(0, 0));
		
		double total = 0;
		for(int i = 0; i < lc.size() - 1; i++) {
			Location first = lc.get(i);
			Location second = lc.get(i+1);
			
			double dis_x = Math.pow(-first.getX() + second.getX(), 2);
			double dis_y = Math.pow(-first.getY() + second.getY(), 2);
			
			total += Math.sqrt(dis_x + dis_y);
		}
		
		System.out.println("총 이동 거리는 " + total);
	}

}
