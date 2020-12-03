import Esercizio_2.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		GestioneRegistro registro = new GestioneRegistro();
		registro.leggiFile();
		boolean error = false;
		char c;
		
		do {
			System.out.println("======================================================================\n" +
		                       "                                  MENU                                \n" +
					           "======================================================================\n" +
			                   "[V]isualizza registro (Permette di visualizzare l'intero registro)\n" +
		                       "[A]ggiungi studente (Permette di aggiungere un nuovo studente)\n" + 
			                   "[I]ncrementa età (Permette di incrementare di 1 l'eta di uno studente)\n" +
			                   "[S]alva (Permette di salvare il registro su di un file)\n" +
			                   "[E]sci (Permette di uscire dal programma)\n");
			
		    System.out.print("\nImmetti il comando da eseguire: ");			
			c = s.next().charAt(0);
						
			switch(c) {
			
			case 'V': 
				registro.visualizzaRegistro();
				break;
					
			case 'A':
				System.out.print("\nInserisci il nome dello studente: ");
				String nome = s.next();
				System.out.print("Inserisci la matricola dello studente: ");
				String matricola = s.next();
				int eta = 0;
				int anno = 0;				
				while(!error) {
					try {
						System.out.print("Inserisci l'età dello studente: ");
					    eta = s.nextInt();
					    System.out.print("Inserisci l'anno di corso dello studente: ");
					    anno = s.nextInt();
					    error = true;
			      	}
				    catch(InputMismatchException e){
					    System.out.println("\nErrore: puoi inserire solamente numeri, ritenta.");
					    System.out.println(e + "\n");
					    s.next();
				    }
				}
				registro.addStudente(new Studente(nome,matricola,eta,anno));
				error = false;
				break;
				
			case 'I':
				System.out.print("\nInserisci il nome dello studente a cui vuoi incrementare l'eta: ");
			    String nome_m = s.next();
			    registro.incrementaEta(nome_m);;
				break;
				
			case 'S': 
				registro.salva();
				break;
			
			case 'E':
				char risposta = 0;
				if(!registro.daSalvare()) 
					break;
				else {
					System.out.print("\nAttenzione salvataggio non effettuato, uscendo tutte le modifiche andranno perse.\nContinuare?[S/N]: ");
					while(!error) {
						try {	
							risposta = s.next().charAt(0);
							if(risposta != 'S' && risposta != 'N')
								throw new Exception();
							else error = true;
						}
						catch(Exception e) {
							System.out.println("\nErrore: La risposta può essere solamente 'S' o 'N'");
						}
					}
					if(risposta == 'S')
						break;
					else {
						registro.salva();
						System.out.println("Salvataggio effettuato correttamente!");
						break;
				
					}
				}
				
			default: 
				System.out.println("\nCarattere non valido (Attenzione utilizza solo maiuscole)");
			}
			
		}while(c != 'e' && c != 'E');
		
		s.close();		
	}

}
