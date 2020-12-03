package Esercizio_1;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		Vector<String> vettore = new Vector<String>();
		dividiFile dividi = new dividiFile("File.txt",",");
		
		vettore = dividi.dividi();
		
		System.out.println(vettore);
		
		

	}

}
