package Esercizio_3;

//Definisce una classe che descrive un contatore inizializzato a 0
public class Contatore {
	
	//Valore iniziale del contatore
	private int valore = 0;
	
	// Restituisce il valore del contatore
	public int getValore() {return valore;}
	
	// Incrementa di uno il contatore
	public void incrementa() { valore++; }
	
	// Decrementa di uno il contatore
	public void decrementa() { valore--; }
	
	// Azzera il contatore
	public void azzera() { valore = 0; }

}
