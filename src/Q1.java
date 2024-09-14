import javax.swing.*;
import java.awt.*;

public class Q1 extends JFrame {
	public Q1() {
		setTitle("4 Images");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout());
		
		ImageIcon img1 = new ImageIcon("images/IMG_5160.jpg");
		JLabel imgLabel1 = new JLabel(img1);
		ImageIcon img2 = new ImageIcon("images/IMG_5146.jpg");
		JLabel imgLabel2 = new JLabel(img2);
		ImageIcon img3 = new ImageIcon("images/IMG_5145.jpg");
		JLabel imgLabel3 = new JLabel(img3);
		ImageIcon img4 = new ImageIcon("images/IMG_5143.jpg");
		JLabel imgLabel4 = new JLabel(img4);
		
		c.add(imgLabel1);
		c.add(imgLabel2);
		c.add(imgLabel3);
		c.add(imgLabel4);
		
		setSize(500, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Q1();
	}

}
