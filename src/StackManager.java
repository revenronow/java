import java.util.Scanner;

interface StackInterface {
	int length();
	String pop();
	boolean push(String ob);
}

class StringStack implements StackInterface {
	String[] word = new String[5];
	private int cnt = 0;
	
	public int length() {
		return cnt + 1;
	}
	
	public String pop() {
		return word[--cnt];
	}
	
	@Override
	public boolean push(String ob) {
		if(cnt == 5)
			return false;
		else {
			word[cnt] = ob;
			cnt++;
			return true;
		}
	}
}

public class StackManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringStack stack = new StringStack();
		
		System.out.print(">> ");
		for(int i = 0; i < 5; i++)
			stack.push(scanner.next());
		
		for(int i = 0; i < 5; i++)
			System.out.print(stack.pop() + " ");
	}

}
