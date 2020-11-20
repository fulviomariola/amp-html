package box;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel {
	public static void main(String[] args) {
		
		/* JPanel = un componente che funziona come un container 
		all'interno di altri componenti
		*/
		ImageIcon icon = new ImageIcon("resource/emoticon.png");
	
		JLabel label = new JLabel();
		label.setText("Hello!");
		label.setIcon(icon);
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.RIGHT);
		label.setBounds(100, 100, 150, 150);
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0,0,250,250);
		redPanel.setLayout(null);

		JPanel bluPanel = new JPanel();
		bluPanel.setBackground(Color.blue);
		bluPanel.setBounds(250,0,250,250);
		bluPanel.setLayout(null);

		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0,250,500,250);
		greenPanel.setLayout(null);
		
		JFrame frame = new JFrame();
		frame.setTitle("Gestione Pannelo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);
		frame.setVisible(true);
		greenPanel.add(label);
		
		frame.add(redPanel);
		frame.add(bluPanel);
		frame.add(greenPanel);
		
	}
}
