package Esercizio_2;

public class Studente {
	private String nome;
	private String matricola;
	private int eta;
	private int anno;
	
	public Studente(String nome, String matricola, int eta, int anno) {
		this.nome = nome;
		this.matricola = matricola;
		this.eta = eta;
		this.anno = anno;
	}

	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}

	public String getMatricola() {return matricola;}
	public void setMatricola(String matricola) {this.matricola = matricola;}

	public int getEta() {return eta;}
	public void setEta(int eta) {this.eta = eta;}

	public int getAnno() {return anno;}
	public void setAnno(int anno) {this.anno = anno;}

    public void incrementaEta() {eta += 1;}

	public String toString() {
		return "\nNome: " + nome +"\nMatricola: " + matricola +"\nEtà: " + eta +"\nFrequenta il "+ anno + " anno\n";
	}
	
	public String toStringToken(String token) {
		return nome+token+matricola+token+eta+token + anno +"\n";
	}
	
}