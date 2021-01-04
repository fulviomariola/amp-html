package GUISwing.menubar;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

public class MenuBarDemo extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2988315184909737523L;
	JMenuBar menuBar;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	JMenu settingMenu;
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	JMenuItem selectItem;
	JMenuItem copyItem;
	JMenuItem pasteItem;
	ImageIcon loadIcon;
	ImageIcon saveIcon;
	ImageIcon exitIcon;
	
	public MenuBarDemo() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		loadIcon = new ImageIcon("image/load.jpg");
		saveIcon = new ImageIcon("image/save.png");
		exitIcon = new ImageIcon("image/exit.png");
		
		menuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		settingMenu = new JMenu("Setting");
		helpMenu = new JMenu("Help");
		
		// sub-menu of JMenu("File")
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		// sub-menu of JMenu("Edit")
		selectItem = new JMenuItem("Selected");
		copyItem = new JMenuItem("Copy");
		pasteItem = new JMenuItem("Paste");
		
	/* ********************************************* */
	
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		loadItem.setIcon(loadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);
		
		fileMenu.setMnemonic(KeyEvent.VK_ALT); // F for file
		editMenu.setMnemonic(KeyEvent.VK_E); // E for edit
		settingMenu.setMnemonic(KeyEvent.VK_T); // T for setting
		helpMenu.setMnemonic(KeyEvent.VK_H); // H for help
		
		loadItem.setMnemonic(KeyEvent.VK_L); // L for load
		saveItem.setMnemonic(KeyEvent.VK_S); // S for save
		exitItem.setMnemonic(KeyEvent.VK_X); // E for exit
		
	/* ********************************************* */
		
		// add Item to File
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		// add Item to Edit
		editMenu.add(selectItem);
		editMenu.add(copyItem);
		editMenu.add(pasteItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(settingMenu);
		menuBar.add(helpMenu);
		
		
		this.setJMenuBar(menuBar);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == loadItem) {
			System.out.println("*beep boop* you loaded a files");
		}
		
		if(e.getSource() == saveItem) {
			System.out.println("Save the element");
		}
		
		if(e.getSource() == exitItem) {
			System.exit(0);
		}
	}
}
