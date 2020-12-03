package Esercizio_3;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

//gestisce l'evento di pressione del bottone "Mostra"
public class ButtonMostraActionListener implements ActionListener {

	// oggetto contatore
	private Contatore cont;
	
	// costruisce il gestore dell'evento ricevendo
	// il contatore come parametro
	public ButtonMostraActionListener(Contatore cont) {
		this.cont = cont;
	}
	
	// quando viene premuto il bottone, richiama il
	// metodo getValore() e mostra il risultato in un pop-up
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null,"Il valore del contatore è: " + cont.getValore());
	}

}
