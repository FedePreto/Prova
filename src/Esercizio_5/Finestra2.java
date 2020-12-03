package Esercizio_5;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

// questa classe rappresenta una finestra con una etichetta di
// testo e un bottone. Visto che l'unico evento generato
// e' la pressione del bottone, la stessa classe fara' anche
// da gestore dell'evento
@SuppressWarnings("serial")
public class Finestra2 extends JFrame implements ActionListener {

	// memorizza un riferimento all'altra finestra
	public Finestra1 f1;
		
	// costruttore (fa tutto il lavoro)
	public Finestra2(Finestra1 f1) {
		// inizializza il riferimento all'altra finestra
		this.f1 = f1;
		// costruisce tutti gli elementi di questa finestra		
		this.setSize(150,100);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel testo  = new JLabel("Finestra 2");
		JButton bottone = new JButton("Passa a 1");
		bottone.addActionListener(this);
		JPanel panel = new JPanel();
		panel.add(testo);
		panel.add(bottone);
		this.add(panel);
		// NOTA: non rende questa finestra visibile
		// ossia, non fa this.setVisible(true)
		// sara' compito dell'altra finestra rendere
		// visibile questa
	}

	// gestore dell'evento di pressione del bottone
	public void actionPerformed(ActionEvent e) {
		// nasconde la finestra corrente
		this.setVisible(false);
		// visualizza l'altra finestra
		f1.setVisible(true);
	}

}
