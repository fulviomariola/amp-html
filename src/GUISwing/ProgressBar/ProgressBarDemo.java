package GUISwing.ProgressBar;

import java.awt.*;
import javax.swing.*;

import jdk.internal.org.jline.terminal.impl.AbstractWindowsConsoleWriter;

public class ProgressBarDemo {

	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar(0,100);
	
	
	ProgressBarDemo () {
		
		//for (int i = 0; i<100;i++) {
			bar.setValue(0);
		//}
		bar.setBounds(0, 0, 420, 50);
		bar.setStringPainted(true);
		bar.setFont(new Font("MV Boli", Font.ROMAN_BASELINE ,24));
		bar.setForeground(Color.red);
		bar.setBackground(Color.black);

		
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
	}
	
	public void fill() {
		int cnt = 0;
		
		while (cnt<=100) {
			bar.setValue(cnt);
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Temo" + cnt);
			cnt = cnt + 1;
		}
		//frame.setVisible(false);
		bar.setString("DONE!!!");
		frame.dispose();
		
	}
}
