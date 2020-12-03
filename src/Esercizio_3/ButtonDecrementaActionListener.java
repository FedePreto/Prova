package Esercizio_3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//gestisce l'evento di pressione del bottone "Decrementa"
public class ButtonDecrementaActionListener implements ActionListener {

	// oggetto contatore
	private Contatore cont;
	
	// costruisce il gestore dell'evento ricevendo
	// il contatore come parametro
	public ButtonDecrementaActionListener(Contatore cont) {
		this.cont = cont;
	}
	
	// quando viene premuto il bottone, richiama il
	// metodo decrementa()
	public void actionPerformed(ActionEvent e) {
		cont.decrementa();
	}
}
