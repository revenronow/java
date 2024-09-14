import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q7 extends JFrame {
	JLabel lab;
	public Q7() {
		setTitle("0으로 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setLocationRelativeTo(null);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(new FirstPanel(), BorderLayout.NORTH);
		c.add(new SecondPanel(), BorderLayout.SOUTH);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	class FirstPanel extends JPanel {
		public FirstPanel() {
			setLayout(new FlowLayout());
			lab = new JLabel(Integer.toString((int)(Math.random() * 59)+1));
			lab.setFont(new Font("Arial", Font.PLAIN, 30));
			add(lab);
		}
	}
	
	class SecondPanel extends JPanel {
		public SecondPanel() {
			setLayout(new FlowLayout());
			
			JButton[] btn = new JButton[3];
			btn[0] = new JButton("+2");
			btn[1] = new JButton("-1");
			btn[2] = new JButton("%4");
			
			for(int i = 0; i < 3; i++) {
				btn[i].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JButton b = (JButton)e.getSource();
						if(b == btn[0]) {
							lab.setText(Integer.toString(Integer.parseInt(lab.getText()) + 2));
							btn[0].setEnabled(false);
							if(btn[1].isEnabled() == false && btn[2].isEnabled() == false) {
								setTitle("실패");
							}
						}
						else if(b == btn[1]) {
							lab.setText(Integer.toString(Integer.parseInt(lab.getText()) - 1));
							btn[1].setEnabled(false);
							if(lab.getText().equals("0")) {
								new Q7();
								dispose();
							}
							else if(btn[0].isEnabled() == false && btn[2].isEnabled() == false) {
								setTitle("실패");
							}
						}
						else if(b == btn[2]) {
							lab.setText(Integer.toString(Integer.parseInt(lab.getText()) % 4));
							btn[2].setEnabled(false);
							if(lab.getText().equals("0")) {
								new Q7();
								dispose();
							}
							else if(btn[0].isEnabled() == false && btn[1].isEnabled() == false) {
								setTitle("실패");
							}
						}
					}
				});

				add(btn[i]);
			}
		}
	}

	public static void main(String[] args) {
		new Q7();
	}

}
