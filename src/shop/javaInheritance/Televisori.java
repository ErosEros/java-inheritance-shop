package shop.javaInheritance;

public class Televisori extends Prodotto {
	double dimensioni;
	boolean proprieta;
	public Televisori(String nome, String marca, double prezzo, double dimensioni,
			boolean proprieta) {
		super(nome, marca, prezzo);
		this.dimensioni = dimensioni;
		this.proprieta = proprieta;
	}
	public double getDimensioni() {
		return dimensioni;
	}
	public void setDimensioni(double dimensioni) {
		this.dimensioni = dimensioni;
	}
	public boolean isProprieta() {
		return proprieta;
	}
	public void setProprieta(boolean proprieta) {
		this.proprieta = proprieta;
	}
	
}
