import javax.swing.*;
import java.awt.*;

public class Q2 extends JFrame {
	public Q2() {
		setTitle("메뉴 만들기");
		createMenu();
		
		setSize(500, 400);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu m = new JMenu("보기");
		
		m.add(new JMenuItem("화면확대"));
		m.addSeparator();
		m.add(new JMenuItem("쪽윤곽"));
		
		mb.add(new JMenu("파일"));
		mb.add(new JMenu("편집"));
		mb.add(m);
		mb.add(new JMenu("입력"));
		
		setJMenuBar(mb);
	}
	
	public static void main(String[] args) {
		new Q2();
	}

}
