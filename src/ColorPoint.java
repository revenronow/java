class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class ColorPoint extends Point {
	public String Color;
	public ColorPoint(int x, int y, String Color) {
		super(x, y);
		this.Color = Color;
	}
	
	public void setPoint(int x, int y) {
		super.move(x, y);
	}
	
	public void setColor(String Color) {
		this.Color = Color;
	}
	
	public void show() {
		System.out.print(this.Color + "색으로(" + this.getX() + "," + this.getY() + ")");
	}

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setPoint(10, 20);
		cp.setColor("GREEN");
		cp.show();
	}

}
