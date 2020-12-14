package GUISwing.JSlider;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderDemo implements ChangeListener{

	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	
	JSliderDemo() {
		frame = new JFrame("JSlider Demo");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0,100,50); // (MIN,MAX,START)
		
		slider.setPreferredSize(new Dimension(400,200));
		
		slider.setPaintTicks(true);		
		slider.setMinorTickSpacing(10); // tratteggia lo slider con spazi da 10 range
		
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25);
		
		slider.setPaintLabels(true); // enumera solo i majorTrack
		slider.setFont(new Font("MV Boli",Font.PLAIN,15));
		label.setFont(new Font("MV Boli",Font.PLAIN,25));
		
		slider.setOrientation(SwingConstants.VERTICAL);
		
		label.setText("°C = " + slider.getValue());
		
		slider.addChangeListener(this);
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(420,420);
		frame.setVisible(true);
		
	}
	
	
	@Override
	public void stateChanged(ChangeEvent e) {
		
		label.setText("°C = " + slider.getValue());
	}

}
