package GUISwing.JOptionPane;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Main {

	public static void main(String[] args) {
		// JOptionPane = crea uno standard pop-up che informa l'utente
		// di alcune cose. 

		//JOptionPane optionPane = new JOptionPane();
		
		
		//JOptionPane.showMessageDialog(null, "Messaggio", "Titolo", JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Here more useless info :D", "Titolo", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Relly?", "Info", JOptionPane.QUESTION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "You're computer has A VIRUS", "Info", JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Call tech support NOW OR LESS", "Info", JOptionPane.ERROR_MESSAGE);
		
		String response[] = {"No, you are awesome", "Thank you", "blush"};
		ImageIcon icon = new ImageIcon("image/emoticon.jpg");
		JOptionPane.showOptionDialog(null, 
				"You are awesone!", 
				"Secret Message", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, 
				icon, 
				response, 
				0);
		
		
		
		// Può essere utile per inserire i dati nel DB, creare delle query che sono di fatto stringhe
//		String name = JOptionPane.showInputDialog("quale email inserisci");
//		System.out.println("SELECT * FROM eclettici where EMAIL = " + name +";");
		
		
		//int risposta = JOptionPane.showConfirmDialog(null, "OK, vai avanti", "Titolo", JOptionPane.YES_NO_CANCEL_OPTION);		
//		switch(risposta) {
//		case 0: System.out.println("Si vai avanti...");
//				break;
//		case 1: System.out.println("No torna indietro...");
//				break;
//		case 2: System.out.println("Cancella...");
//				break;
//		case -1: System.out.println("XXX");
//				break;
//		default: System.out.println("BOH!");		
//		}
		
		
		
		
//		JFileChooser fc = new JFileChooser();
//		int returnVal = fc.showDialog(FileChooserDemo2.this, "Attach");
	}

}
