import javax.swing.*;
import java.awt.*;

public class Q7 extends JFrame {
	public Q7() {
		super("3개의 패널을 가지는 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JPanel j1 = new JPanel();
		j1.setBackground(Color.YELLOW);
		j1.setLayout(new FlowLayout());
		j1.add(new Button("새로 배치"));
		j1.add(new Button("종료"));
		contentPane.add(j1, BorderLayout.NORTH);
		
		JPanel j2 = new JPanel();
		j2.setLayout(null);
		for(int i = 0; i < 9; i++) {
			JLabel label = new JLabel("*");
			int x = (int)(Math.random() * 200) + 50;
			int y = (int)(Math.random() * 150) + 50;
			label.setOpaque(true);
			label.setLocation(x, y);
			label.setSize(20, 20);
			label.setForeground(Color.MAGENTA);
			
			j2.add(label);
		}
		contentPane.add(j2, BorderLayout.CENTER);
		
		JPanel j3 = new JPanel();
		j3.setBackground(Color.LIGHT_GRAY);
		j3.setLayout(new FlowLayout());
		j3.add(new Button("별 개수 수정"));
		j3.add(new JTextField(15));
		contentPane.add(j3, BorderLayout.SOUTH);
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Q7();
	}

}
