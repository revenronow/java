import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q4 extends JFrame {
	public Q4() {
		setTitle("+,- 키로 폰트 크기 줄이기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		JLabel lab = new JLabel("Love Java");
		c.setLayout(new FlowLayout());
		c.add(lab);
		
		c.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == '+') {
					lab.setFont(new Font("Arial", Font.PLAIN, lab.getFont().getSize() + 5));
				} else if((e.getKeyChar() == '-') && (lab.getFont().getSize()>10)) {
					lab.setFont(new Font("Arial", Font.PLAIN, lab.getFont().getSize() - 5));
				}
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		setSize(250, 120);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}

	public static void main(String[] args) {
		new Q4();
	}

}
