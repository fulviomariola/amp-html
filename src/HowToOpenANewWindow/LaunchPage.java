package HowToOpenANewWindow;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class LaunchPage implements ActionListener{
	JFrame frame = new JFrame();
	JButton myButton = new JButton("New Window");
	
	LaunchPage() {
		myButton.setBounds(100,160,200,40);
		myButton.setFocusable(false);
		myButton.addActionListener(this);
		
		frame.add(myButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("Ciao");
		
		// Trigger in event
		 
		if(e.getSource() == myButton) {
			// Chiuso il frame una volta che lo ho chiamato, altrimenti crea infiniti pagine con il bottone
			frame.dispose();
			NewWindow myWindow = new NewWindow();
		}
		
	}
}
	