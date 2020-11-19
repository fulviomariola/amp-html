package FlowLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {

		/*
		 * LayoutManager = definisce le interfaccia per classi del quale conosce 
		 * il layout contenitore.
		 * Swing's painting architecture assumes the children of a JComponent do not overlap. 
		 * If a JComponent's LayoutManager allows children to overlap, the JComponent must override 
		 * isOptimizedDrawingEnabled to return false.
		 * 
		 * FlawLyout = A flow layout arranges components in a directional flow, much like lines 
		 * of text in a paragraph. The flow direction is determined by the container's componentOrientation 
		 * property and may be one of two values:
		 * 		ComponentOrientation.LEFT_TO_RIGHT
		 * 		ComponentOrientation.RIGHT_TO_LEFT 
		 * Flow layouts are typically used to arrange buttons in a panel. 
		 * It arranges buttons horizontally until no more buttons fit on the same line. 
		 * The line alignment is determined by the align property. The possible values are:
				LEFT
				RIGHT
				CENTER
				LEADING
				TRAILING
		 * */
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(850,500);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,0,10));  // Gestisce il pannello dei bottoni
		
		//JButton button1 = new JButton("Button");
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(170,250));
		panel.setBackground(Color.lightGray);
		panel.setLayout(new FlowLayout());  // Gestisce i bottoni all'interno del pannello
		
		panel.add(new JButton("But1"));
		panel.add(new JButton("But2"));
		panel.add(new JButton("But3"));
		panel.add(new JButton("But4"));
		panel.add(new JButton("But5"));
		panel.add(new JButton("But6"));
		panel.add(new JButton("But7"));
		panel.add(new JButton("But8"));
		panel.add(new JButton("But9"));
		
		
		frame.add(panel);
		frame.setVisible(true);
	}

}


















