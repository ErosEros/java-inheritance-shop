package shop.javaInheritance;

public class Cuffie extends Prodotto{
	String colore;
	boolean wireless;
	public Cuffie( String nome, String marca, double prezzo, String colore, boolean wireless) {
		super( nome, marca, prezzo);
		this.colore = colore;
		this.wireless = wireless;
		
		
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public boolean isWireless() {
		return wireless;
	}
	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
		
}
