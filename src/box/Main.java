package box;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
	
	public static void main(String[] args) {
		ImageIcon icon = new ImageIcon("cms.jpg");
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		JLabel label = new JLabel();
		label.setText("Creazione HTML/AMP");
		label.setIcon(icon);
		label.setHorizontalTextPosition(JLabel.CENTER);  // set Text LEFT, CENTER, RIGHT og Image Icon
		label.setVerticalTextPosition(JLabel.TOP);  // set Text LEFT, CENTER, RIGHT og Image Icon
		label.setForeground(new Color(0x00FF00));  // set font Color of text
		label.setFont(new Font("Times New Roman",Font.PLAIN,50));  // set font of text
		label.setIconTextGap(0); // Set gap of text to image
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBorder(border);  // Set border of label
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		//label.setBounds(175,0,350,350);  // set x,y, position within frame as well as dimension
		
		
		JFrame frame = new JFrame();
		frame.setTitle("Inserisci Dati HTML");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(700,700);
		//frame.setLayout(null);  // Gestisce il layout della img
		
		frame.setVisible(true);
		frame.add(label);
		frame.pack();
		
		
		
	}
}
