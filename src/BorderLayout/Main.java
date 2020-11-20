package BorderLayout;

public class Main {

	public static void main(String[] args) {
		
		 new MyFrame();
		
		/* BorderLayout == definisce (Lays Out) un contenitore, esso organizza
		 * e ridimensiona i suoi 5 componenti e li adatta in 5 regioni:
		 * nord, sud, este, ovest, centro.
		 * Ogni regione può contenere non più di un componente.
		 * Quando aggiungo un componente  per un contenitore usa uno di 
		 * queste regione, ad esempio:
		 *      Panel p = new Panel();
    			p.setLayout(new BorderLayout());
    			p.add(new Button("Okay"), BorderLayout.SOUTH);
    	 * Per comodotà il BorderLayout interpreta l'assenza di una stringa
    	 * come un CENTER:
    		    Panel p2 = new Panel();
    			p2.setLayout(new BorderLayout());
    			p2.add(new TextArea());  // Same as p.add(new TextArea(), BorderLayout.CENTER); 
		 */
		

		
	}

}
