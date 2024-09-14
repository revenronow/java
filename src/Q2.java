//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//
//public class Q2 extends JFrame {
//	public Q2() {
//		setTitle("키 누르기 예제");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setLocationRelativeTo(null);
//		
//		Container c = getContentPane();
//		c.setBackground(Color.CYAN);
//		c.addKeyListener(new KeyListener() {
//			public void keyPressed(KeyEvent e) {
//				if(e.getKeyChar() == 'R') {
//					c.setBackground(Color.RED);
//				}
//			}
//			
//			public void keyReleased(KeyEvent e) {
//				c.setBackground(Color.CYAN);
//			}
//			
//			public void keyTyped(KeyEvent e) {
//				
//			}
//		});
//		
//		setSize(250, 120);
//		setVisible(true);
//		
//		c.setFocusable(true);
//		c.requestFocus();
//	}
//	
//	public static void main(String[] args) {
//		new Q2();
//	}
//
//}
