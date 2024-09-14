import javax.swing.*;
import java.awt.*;

public class Q5 extends JFrame {
	public Q5() {
		super("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(4, 4));
		
		Color[] color = { 
			Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.DARK_GRAY,
			Color.PINK, Color.GRAY, Color.WHITE, Color.BLACK, Color.BLACK, Color.ORANGE, Color.BLUE, Color.MAGENTA
		};
		
		for(int i = 0; i < 16; i++) {
			JLabel label = new JLabel(Integer.toString(i));
			label.setBackground(color[i]);
			label.setOpaque(true);
			contentPane.add(label);
		}
		
		setSize(400, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Q5();
	}

}
