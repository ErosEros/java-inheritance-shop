package shop.javaInheritance;

public class Televisori extends Prodotto {
	double dimensioni;
	boolean proprieta;
	public Televisori(int codice, String nome, String marca, double prezzo, int iva, double dimensioni,
			boolean proprieta) {
		super(codice, nome, marca, prezzo, iva);
		this.dimensioni = dimensioni;
		this.proprieta = proprieta;
	}
	
}
