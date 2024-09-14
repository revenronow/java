import javax.swing.*;
import java.awt.*;

public class Q6 extends JFrame {
	public Q6() {
		super("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		for(int i = 0; i < 19; i++) {
			JLabel label = new JLabel(Integer.toString(i));
			int x = (int)(Math.random() * 220) + 30;
			int y = (int)(Math.random() * 220) + 30;
			label.setLocation(x, y);
			label.setSize(20, 20);
			label.setForeground(Color.MAGENTA);
			
			contentPane.add(label);
		}
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Q6();
	}

}
