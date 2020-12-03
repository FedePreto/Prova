package Esercizio_1;
import java.util.*;
import java.io.*;

public class dividiFile {
	
	private String nomeFile;
	private String divisore;
	private Vector<String> vettore = new Vector<String>();
	
	public dividiFile(String nomeFile, String divisore) {
		this.nomeFile = nomeFile;
		this.divisore = divisore;
	}
	
	public Vector<String> dividi() {
		try {
			Scanner in = new Scanner(new BufferedReader(new FileReader(nomeFile)));
			in.useDelimiter(divisore);
			while(in.hasNext()) 
				vettore.add(in.next());
			return vettore;
		}
		catch (FileNotFoundException e) {
			System.out.println("Errore I/O");
			e.printStackTrace();
			return null;
		}
		
	}
}
