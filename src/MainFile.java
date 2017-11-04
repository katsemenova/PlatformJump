import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFile {
	private static JFrame frame;
	public static void main(String[] args) {
		startGUI();
	}
	
	public static void startGUI(){
		frame = new JFrame("Platform Jumper");
		frame.setSize(500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}
}
