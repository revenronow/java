import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q4 extends JFrame {
	public Q4() {
		JCheckBox [] cb = new JCheckBox[2];
		String [] play = { "버튼 비활성화", "버튼 감추기" };
		
		setTitle("CheckBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton b = new JButton("Test");
		c.add(b);
		
		for(int i = 0; i < cb.length; i++) {
			cb[i] = new JCheckBox(play[i]);
			c.add(cb[i]);
			cb[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JCheckBox c = (JCheckBox)e.getSource();
					if(e.getActionCommand() == "버튼 비활성화") {
						b.setEnabled(false);
					}
					else {
						b.setEnabled(true);
					}
					
					if(e.getActionCommand() == "버튼 감추기") {
						b.setVisible(false);
					}
					else {
						b.setVisible(true);
					}
				}
			});
			
			c.add(cb[i]);
		}
		
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Q4();
	}

}
