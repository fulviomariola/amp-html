package box;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainPanel {
	public static void main(String[] args) {
		
		/* JPanel = un componente che funziona come un container 
		all'interno di altri componenti
		*/
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0,0,250,250);
		
		JFrame frame = new JFrame();
		frame.setTitle("Gestione Panel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);
		frame.setVisible(true);
		frame.add(redPanel);

	}
}
