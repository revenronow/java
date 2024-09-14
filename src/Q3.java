import java.awt.*;
import javax.swing.*;

public class Q3 extends JFrame {
	public Q3() {
		setTitle("FlowLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 40));
		contentPane.add(new JLabel("100 + 200"));
		contentPane.add(new JButton("="));
		contentPane.add(new JLabel("300"));
		
		setSize(400, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Q3();
	}

}
