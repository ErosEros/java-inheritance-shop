package shop.javaInheritance;
import java.util.Random;
public class Prodotto {

	private int codice ;
	String nome;
	String marca;
	double prezzo;
	double iva ;
	
	public Prodotto( String nome, String marca, double prezzo) {
		super();
		this.codice = r.nextInt(1000);
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = (this.prezzo *22) /100;
	}
	
//	Random 
	Random r = new Random();

// GETTERS E SETTERS	
	
	public int getCodice() {
		return this.codice;
	}



//	public void setCodice(int codice) {
//		this.codice = codice;
//	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public double getPrezzo() {
		return prezzo;
	}



	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}



	public double getIva() {
		return iva;
	}



	public void setIva(int iva) {
		this.iva = iva;
	}


// METODO PER VISUALIZZARE PREZZO BASE
	double prezzoBase() {
		return prezzo;
	}
	
// METODO PER VISUALIZZARE PREZZO + IVA
	double prezzoConIva() {
		return  prezzo + iva;
	}
	}

	