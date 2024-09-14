import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q1 extends JFrame {
	public Q1() {
		setTitle("마우스 올리기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel lab = new JLabel("자기야");
		lab.addMouseListener(new MyMouseListener());
		c.add(lab);
		
		setSize(250, 120);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Q1();
	}

}

class MyMouseListener extends MouseAdapter {
	public void mouseEntered(MouseEvent e) {
		JLabel a = (JLabel)e.getSource();
		if(a.getText().equals("자기야"))
			a.setText("사랑해");
		else
			a.setText("자기야");
	}
}