package GUISwing.ComboBoxes;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
	
	/**
	 * JComboBox = è un componente Swing che combina bottoni oppure file di testo e liste drop-down
	 */
	private static final long serialVersionUID = 1L;
	JComboBox comboBox;

	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		//String [] animals = {"Dog", "Cat", "Bird"};
		
		Integer [] animals = {1,2,3}; // int non va bene con JComboBox dato che è primitivo, invece è perfetto se utilizzo la classe Integer
		
		comboBox = new JComboBox(animals);
		comboBox.addActionListener(this);
		
		//comboBox.setEditable(true);
		//System.out.println(comboBox.getItemCount()); conta l'array animals
		
		// con qeusto metodo posso aggiungere un elemento quando ne ho bisogno
//		comboBox.addItem("horse");
//		
//		comboBox.insertItemAt("pig", 0);
		comboBox.setSelectedIndex(0);
//		comboBox.removeItem("Cat");
		//comboBox.removeItemAt(1);
		//comboBox.removeAllItems();
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == comboBox) {
			System.out.println(comboBox.getSelectedItem());
			//System.out.println(comboBox.getSelectedIndex());
		}
	}

}
