import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q6 extends JFrame {
	public Q6() {
		setTitle("3x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(Color.WHITE);
		c.setLayout(new GridLayout(3, 4));
		c.addMouseListener(new MyMouseListener());
		
		for(int i = 0; i < 12; i++) {
			String text = Integer.toString(i);
			JLabel la = new JLabel(text);
			c.add(la);
			la.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {
					int r = (int)(Math.random() * 256);
					int g = (int)(Math.random() * 256);
					int b = (int)(Math.random() * 256);
					la.setOpaque(true);
					la.setBackground(new Color(r, g, b));
				}
				
				public void mousePressed(MouseEvent e) {}
				public void mouseReleased(MouseEvent e) {}
				public void mouseEntered(MouseEvent e) {}
				public void mouseExited(MouseEvent e) {}
			});
		}
		
		setSize(500, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Q6();
	}

}
