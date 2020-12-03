package Esercizio_3;


import javax.swing.*;

public class ContatoreGUI {

	public static void main(String[] args) {
		
		// l'oggetto contatore che vogliamo utilizzare
		Contatore cont = new Contatore();
		
		// crea la finestra del menu principale
		JFrame menu = new JFrame("Menu Principale");
		// imposta la dimensione della finestra
		menu.setSize(300, 110);
		// specifica che la chiusura della finestra deve
		// fare terminare l'intero programma
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// primo bottone (mostra il valore del contatore)
		JButton button_mostra = new JButton("Mostra");
		// associa al bottone il suo comportamento
		button_mostra.addActionListener(new ButtonMostraActionListener(cont));
		
		// secondo bottone (incrementa di 1)
		JButton button_incrementa = new JButton("Incrementa");
		// associa al bottone il suo comportamento
		button_incrementa.addActionListener(new ButtonIncrementaActionListener(cont));

		// terzo bottone (decrementa di 1)
		JButton button_decrementa = new JButton("Decrementa");
		// associa al bottone il suo comportamento
		button_decrementa.addActionListener(new ButtonDecrementaActionListener(cont));
		
		// quarto bottone (azzera il contatore)
		JButton button_azzera = new JButton("Azzera");
		// associa al bottone il suo comportamento
		button_azzera.addActionListener(new ButtonAzzeraActionListener(cont));

		// un panel e' un contenitore di elementi da
		// visualizzare in una finestra
		JPanel panel = new JPanel();
		
		// aggiungiamo tutti i bottoni al panel
		// nell'ordine in cui vogliamo siano visualizzati
		panel.add(button_mostra);
		panel.add(button_incrementa);
		panel.add(button_decrementa);
		panel.add(button_azzera);
		
		// infine aggiungiamo il panel alla finestra
		menu.add(panel);
		
		// visualizza la finestra
		menu.setVisible(true);
	}

}
