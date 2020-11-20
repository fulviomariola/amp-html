package box;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -577483215549437994L;

	MyFrame() {
		
		this.setTitle("Inserisci Dati HTML");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(420,420);		
		this.setVisible(true);
		
		ImageIcon icon = new ImageIcon("cms.jpg");
		this.setIconImage(icon.getImage());
		this.getContentPane().setBackground(new Color(123,50,250));
		
	} 

}
