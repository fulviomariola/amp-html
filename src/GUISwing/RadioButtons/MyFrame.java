package GUISwing.RadioButtons;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
	
	
	JRadioButton pizzaButton;
	JRadioButton hamburgerButton;
	JRadioButton hotdogButton;
	
	ImageIcon pizzaIcon;
	ImageIcon hamburgerIcon;
	ImageIcon hotdogIcon;
	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		pizzaIcon = new ImageIcon("image/pizza.png");
		hamburgerIcon = new ImageIcon("image/hamburger.png");
		hotdogIcon = new ImageIcon("image/hotdog.png");
		
		pizzaButton = new JRadioButton("Pizza");
		hamburgerButton = new JRadioButton("Hamburger");
		hotdogButton = new JRadioButton("Hot Dog ");
		
		// Se non aggiungo il group e lancio l'app clicco tutti e tre 
		// i JRadioButton contemporaneamente, invece con il group ne posso
		// cliccare uno escludendo gli altri
		ButtonGroup group = new ButtonGroup();
		group.add(pizzaButton);
		group.add(hamburgerButton);
		group.add(hotdogButton);
		
		pizzaButton.addActionListener(this);
		hamburgerButton.addActionListener(this);
		hotdogButton.addActionListener(this);
		
		pizzaButton.setIcon(pizzaIcon);
		hamburgerButton.setIcon(hamburgerIcon);
		hotdogButton.setIcon(hotdogIcon);
		
		this.add(pizzaButton);
		this.add(hamburgerButton);
		this.add(hotdogButton);
		this.pack();
		this.setVisible(true);
		


	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == pizzaButton) 
			System.out.println("OK Pizza");
		else if (e.getSource() == hamburgerButton) {
			System.out.println("OK Hamburger");
		}
		
		else {
			System.out.println("OK Hot Dog");

		}		
	}
}
