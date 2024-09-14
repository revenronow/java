import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q8 extends JFrame {
	public Q8() {
		setTitle("+,- 키로 폰트 크기 줄이기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		JLabel lab = new JLabel("Love Java");
		c.setLayout(new FlowLayout());
		c.add(lab);
		
		lab.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				int n = e.getWheelRotation();
				if(n < 0) {
					lab.setFont(new Font("Arial", Font.PLAIN, lab.getFont().getSize() + 5));
				} else {
					lab.setFont(new Font("Arial", Font.PLAIN, lab.getFont().getSize() - 5));
				}
			}
		});
		
		setSize(250, 120);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Q8();
	}

}
