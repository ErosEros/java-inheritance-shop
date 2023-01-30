package shop.javaInheritance;

public class Cuffie extends Prodotto{
	String colore;
	boolean wireless;
	boolean cablate;
	public Cuffie( String nome, String marca, double prezzo, int iva, String colore, boolean wireless,
			boolean cablate) {
		super( nome, marca, prezzo);
		this.colore = colore;
		this.wireless = wireless;
		this.cablate = cablate;
		
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
	public boolean isCablate() {
		return cablate;
	}
	public void setCablate(boolean cablate) {
		this.cablate = cablate;
	}
	
}
