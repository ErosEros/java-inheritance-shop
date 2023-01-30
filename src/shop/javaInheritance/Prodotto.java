package shop.javaInheritance;

public class Prodotto {

	private int codice ;
	String nome;
	String marca;
	double prezzo;
	int iva = 22;
	
	public Prodotto(int codice, String nome, String marca, double prezzo, int iva) {
		super();
		this.codice = codice;
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = iva;
	}

// GETTERS E SETTERS	
	
	public int getCodice() {
		return codice;
	}



	public void setCodice(int codice) {
		this.codice = codice;
	}



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



	public int getIva() {
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
		return ( prezzo +(prezzo * iva) /100);
	}
	}

	