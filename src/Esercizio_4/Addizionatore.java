package Esercizio_4;

import javax.swing.*;

// applicazione che somma due numeri
// ATTENZIONE: questa classe estende JFrame, quindi
// la finestra sara'� accessibile tramite "this"
@SuppressWarnings("serial")
public class Addizionatore extends JFrame {

	// elementi della finestra (testo, bottoni, ecc...)
	// sono dichiarati come variabili d'istanza per essere
	// accessibili da altre classi (in particolare il
	// gestore degli eventi - AddizionatoreActionListener)
	public JLabel label1;
	public JTextField campo1;
	public JLabel label2;
	public JTextField campo2;
	public JLabel label3;
	public JTextField campo3;
	public JButton bottone;

	// il main semplicemente crea un oggetto di questa classe
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Addizionatore window = new Addizionatore("Addizionatore");
	}
	
	// il costruttore fa tutto il lavoro
	public Addizionatore(String titolo) {
		super(titolo); // crea il JFrame
		// imposta la dimensione della finestra
		this.setSize(400, 150);
		// specifica che la finestra deve essere centrata
		this.setLocationRelativeTo(null);
		// specifica che la chiusura della finestra
		// deve far terminare il programma
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Crea un'etichetta per il campo1
		label1 = new JLabel("Addendo 1");
		//Setta un nuovo campo di testo da cui andr� a leggere il numero inserito
	    campo1 = new JTextField(25);
		
		// inizializza la seconda casella di input
		label2 = new JLabel("Addendo 2");
		campo2 = new JTextField(25);
		
		// inizializza una casella per visualizzare il risultato
		label3 = new JLabel("  Risultato");
		campo3 = new JTextField(25);
		campo3.setEditable(false); // non modificabile dall'utente
		
		// crea un bottone che fa eseguire il calcolo
		bottone = new JButton("Calcola");
		// collega il bottone al suo gestore degli eventi
		bottone.addActionListener(new AddizionatoreActionListener(this));
		
		// inserisce tutti gli elementi in un panel
		JPanel panel = new JPanel();
		panel.add(label1);
		panel.add(campo1);
		panel.add(label2);
		panel.add(campo2);
		panel.add(label3);
		panel.add(campo3);
		panel.add(bottone);
		
		// inserisce il panel nella finestra
		this.add(panel);
		
		// visualizza la finestra
		this.setVisible(true);
	}

}


