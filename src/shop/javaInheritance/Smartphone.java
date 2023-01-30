package shop.javaInheritance;

public class Smartphone extends Prodotto{
	int	codiceImei;
	int memoria;
	public Smartphone( String nome, String marca, double prezzo, int codiceImei, int memoria) {
		super( nome, marca, prezzo);
		this.codiceImei = codiceImei;
		this.memoria = memoria;
	}
	public int getCodiceMiei() {
		return codiceImei;
	}
	public void setCodiceMiei(int codiceImei) {
		this.codiceImei = codiceImei;
	}
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	
}
