import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Q5 extends JFrame {
	private JTextArea ta = new JTextArea(7, 28);
	
	public Q5() {
		setTitle("메뉴 만들기");
		createSave();
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		ta.setLineWrap(true);
		
		c.add(ta);
		setSize(300, 200);
		setVisible(true);
	}
	
	private void createSave() {
		JMenuBar mb = new JMenuBar();
		JMenu m = new JMenu("파일");
		
		JMenuItem mi = new JMenuItem("저장");
		
		mi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ta.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "입력한 텍스트가 없습니다", "에러", JOptionPane.ERROR_MESSAGE);
				}
				else {
					String fileName = JOptionPane.showInputDialog("저장할 파일명을 입력하세요");
					if(fileName == null) {
						return;
					}
					try {
						FileWriter fout = new FileWriter(fileName);
						String s = ta.getText();
						StringTokenizer st = new StringTokenizer(ta.getText(), "\n");
						
						while(st.hasMoreTokens()) {
							fout.write(st.nextToken());
							fout.write("\r\n");
						}
					}
					catch (IOException e1) {};
				}
			}
		});
		
		m.add(mi);

		mb.add(m);
		
		setJMenuBar(mb);
	}
	
	public static void main(String[] args) {
		new Q5();
	}

}
