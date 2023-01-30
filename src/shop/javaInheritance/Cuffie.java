package shop.javaInheritance;

public class Cuffie extends Prodotto{
	String colore;
	boolean wireless;
	boolean cablate;
	public Cuffie(int codice, String nome, String marca, double prezzo, int iva, String colore, boolean wireless,
			boolean cablate) {
		super(codice, nome, marca, prezzo, iva);
		this.colore = colore;
		this.wireless = wireless;
		this.cablate = cablate;
	}

}
