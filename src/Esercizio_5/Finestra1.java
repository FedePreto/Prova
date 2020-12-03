package Esercizio_5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

// questa classe rappresenta una finestra con una etichetta di
// testo e un bottone. Visto che l'unico evento generato
// e' la pressione del bottone, la stessa classe fara' anche
// da gestore dell'evento
@SuppressWarnings("serial")
public class Finestra1 extends JFrame implements ActionListener {

	// memorizza un riferimento all'altra finestra
	public Finestra2 f2;
	
	// costruisce un oggetto Finestra1
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Finestra1 f1 = new Finestra1();
	}
	
	// costruttore (fa tutto il lavoro)
	public Finestra1() {
		// crea l'altra finestra passandogli this
		// e salva il riferimento in f2
		f2 = new Finestra2(this);
		// costruisce tutti gli elementi di questa finestra
		this.setSize(150,100);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel testo  = new JLabel("Finestra 1");
		JButton bottone = new JButton("Passa a 2");
		bottone.addActionListener(this);
		JPanel panel = new JPanel();
		panel.add(testo);
		panel.add(bottone);
		this.add(panel);
		// visualizza la finestra
		this.setVisible(true);
	}

	// gestore dell'evento di pressione del bottone
	public void actionPerformed(ActionEvent e) {
		// nasconde la finestra corrente
		this.setVisible(false);
		// visualizza l'altra finestra
		f2.setVisible(true);
	}

}
