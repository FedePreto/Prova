package Esercizio_2;
import java.util.*;
import java.io.*;

public class GestioneRegistro {

	public ArrayList<Studente> matrice = new ArrayList<Studente>();
	private boolean modificato = false;
		
		
public ArrayList<Studente> leggiFile() {
		ArrayList<String> righeFile = new ArrayList<String>();
		try {
			Scanner read = new Scanner (new BufferedReader(new FileReader("Registro.txt")));
			while(read.hasNext()) {
				String s = read.nextLine();
				righeFile.add(s);
			}
	    }
		catch(IOException e){
			salva();
	    }
		
		return dividiFile(righeFile);	             
}
			
		
public ArrayList<Studente> dividiFile(ArrayList<String> righeFile) {
	    	for (int i = 0; i < righeFile.size(); i++) {
				StringTokenizer token = new StringTokenizer(righeFile.get(i)," ");	    	
				
				try{
					matrice.add(new Studente(token.nextToken(),token.nextToken(),Integer.parseInt(token.nextToken()),Integer.parseInt(token.nextToken())));
						
				}
				catch(NoSuchElementException e) {
					System.out.println("Errore: Nel registro alla riga " + (i+1) + " mancano uno o più dati");
					System.out.println(e);
					
				}				
			} 
	    	return matrice;
}
		
		
public void salva() {		
			try {
				BufferedWriter write = new BufferedWriter(new FileWriter("Registro.txt"));
				modificato = false;
				for (int i = 0; i < matrice.size(); i++) 			
					write.write(matrice.get(i).toStringToken(" "));
				write.close();
			}
			catch(IOException e) {				
				System.out.println("Errore di I/O");
				System.out.println(e);
			}
}
			
		public void visualizzaRegistro() {
			if(matrice.isEmpty())
				System.out.println("\n%%%%%%%%%% ATTENZIONE: il registro è vuoto %%%%%%%%%%%%");
			else for(int i=0; i<matrice.size(); i++)
				System.out.print("\nStudente " + (i+1) + matrice.get(i));			
		}
		
		public void addStudente(Studente s) {
			matrice.add(s);
			modificato = true;
			System.out.println("\nStudente aggiunto correttamente in posizione " + (matrice.indexOf(s)+1));
		}
		
		public void incrementaEta(String nome) {
			for(int i = 0; i<matrice.size(); i++) 
				if(nome.equals(matrice.get(i).getNome())) {
					matrice.get(i).incrementaEta();
					System.out.println("L'età di " + nome + " è diventata " + matrice.get(i).getEta());
				}
				else if(i == matrice.size()-1)
					System.out.println("\nErrore: nome non presente nella lista, ritenta");
			modificato = true;
		}

        public boolean daSalvare() {
        	return modificato;
        }
}
