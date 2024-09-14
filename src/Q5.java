import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q5 extends JFrame {
	int x, y;
	public Q5() {
		setTitle("클릭 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		JLabel lab = new JLabel("c");
		c.setLayout(null);
		
		lab.setBounds(50, 50, 40, 40);
		
		c.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				int x = (int)(Math.random()*getContentPane().getWidth() - lab.getWidth());
				int y = (int)(Math.random()*(getContentPane().getHeight() - lab.getHeight()));
				lab.setLocation(x, y);
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
		});
		
		c.add(lab);
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Q5();
	}

}
