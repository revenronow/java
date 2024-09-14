import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q3 extends JFrame {
	public Q3() {
		setTitle("키 누르기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(Color.GREEN);
		MyMouseListener listen = new MyMouseListener();
		c.addMouseListener(listen);
		c.addMouseMotionListener(listen);
		
		setSize(250, 120);
		setVisible(true);
	}
	
	class MyMouseListener implements MouseListener, MouseMotionListener {
		public void mouseReleased(MouseEvent e) {
			Component c=(Component)e.getSource();
			c.setBackground(Color.GREEN);
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		public void mouseDragged(MouseEvent e) {
			Component c=(Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		public void mouseMoved(MouseEvent e) {}
	}
	
	public static void main(String[] args) {
		new Q3();
	}

}
