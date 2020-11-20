package GridLayout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		/*
		 * LayoutManager = definisce le interfaccia per classi del quale conosce 
		 * il layout contenitore.
		 * Swing's painting architecture assumes the children of a JComponent do not overlap. 
		 * If a JComponent's LayoutManager allows children to overlap, the JComponent must override 
		 * isOptimizedDrawingEnabled to return false.
		 * 
		 * GridLayout = questa classe è un layout manager , contiene i componenti di un contenitore in una griglia (grid)
		 * rettangolare.
		 * Il container è diviso fra rettangoli della stessa grandezza ed un componente è inserito in ogni rettangolo
		 *  
		 * */
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new GridLayout(3,3,10,10));		// in GridLayout la prima sono righe, la seconda sono colonne il terzo è lo spazio orizzontale, il querto è lo spazio verticale
		
		//JButton button1 = new JButton("1");
		
		//frame.add(button1);
		// oppure
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		frame.add(new JButton("10"));
		
		
		frame.setVisible(true);
	}

}
