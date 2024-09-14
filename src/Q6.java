import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q6 extends JFrame {
	private JTextField tf1;
	private JTextField tf2;
	private JRadioButton [] rb = new JRadioButton[4];
	private String [] rb_text = {"decimal", "binary", "octal", "hex"};
	
	public Q6() {
		setTitle("Digit Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ButtonGroup g = new ButtonGroup();
		
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		
		c.add(tf1);
		c.add(new JLabel("->"));
		c.add(tf2);
		
		for(int i = 0; i < rb.length; i++) {
			rb[i] = new JRadioButton(rb_text[i]);
			c.add(rb[i]);
			rb[i].addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange() == ItemEvent.SELECTED && !tf1.getText().equals("")) {
						if(e.getItem() == rb[0]) {
							tf2.setText(Integer.toString(Integer.parseInt(tf1.getText())));
						}
						else if(e.getItem() == rb[1]) {
							tf2.setText(Integer.toBinaryString(Integer.parseInt(tf1.getText())));
						}
						else if(e.getItem() == rb[2]) {
							tf2.setText(Integer.toOctalString(Integer.parseInt(tf1.getText())));
						}
						else {
							tf2.setText(Integer.toHexString(Integer.parseInt(tf1.getText())));
						}
					}
				}
			});
			g.add(rb[i]);

		}
		
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Q6();
	}

}
