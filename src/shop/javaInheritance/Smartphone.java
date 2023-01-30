package shop.javaInheritance;

public class Smartphone extends Prodotto{
	int	codiceMiei;
	int memoria;
	public Smartphone(int codice, String nome, String marca, double prezzo, int iva, int codiceMiei, int memoria) {
		super(codice, nome, marca, prezzo, iva);
		this.codiceMiei = codiceMiei;
		this.memoria = memoria;
	}
	
	
}
