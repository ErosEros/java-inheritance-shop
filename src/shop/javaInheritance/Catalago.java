package shop.javaInheritance;

import java.util.Scanner;

public class Catalago {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	SCANNER
		Scanner s = new Scanner(System.in);
		
//  PONGO UNA SCELTA ALL'UTENTE		
		System.out.println("Che sezione vuoi scegliere ?? - smartphone - cuffie - televisori - ?");
		
//  INSERISCO LA SCELTA DELL'UTENTE IN UNA VARIABILE		
	String scelta = s.nextLine();

	
//  CONDIZIONE SCELTA SMARTPHONE
		if(scelta.equals("smartphone")) {
			
			
//	Chiedo all'utente di inserire il nome
			System.out.println("Inserisci nome");
			String nome = s.nextLine();
			
//	Chiedo all'utente di inserire la marca
			System.out.println("Inserisci marca");
			String marca = s.nextLine();
//	Chiedo all'utente di inserire il prezzo		
			System.out.println("Inserisci il prezzo");
			double prezzo = s.nextDouble();
					
//	Chiedo all'utente di inserire il codice IMEI		
			System.out.println("Inserisci il codice Imei");
			int codiceImei = s.nextInt();

//	Chiedo all'utente di inserire la memoria			
			System.out.println("Inserisci la capacità di memoria");
			int memoria = s.nextInt();	
			
			Smartphone smart = new Smartphone( nome, marca, prezzo, codiceImei, memoria);
			
			
			System.out.printf("Ecco il tuo prodotto : %n Il tuo Codice Prodotto è: %s %n"
					+ " Il nome che hai scelto è %s %n"
					+ " La marca che hai scelto è: %s %n"		
					+ "Il codice Imei che hai scelto è: %s %n"
					+ "La capacità di memoria che hai inserito è di %s gb."
					+ "Il prezzo che hai scelto è di %s euro. %n"
					+ "Il prezzo che hai scelto Iva compresa è di %s euro.",
								smart.getCodice(),nome,marca,codiceImei,memoria,prezzo,smart.prezzoConIva());
			
			
		}
		}
	//int n = 3;
	//Prodotto[] catalogoProdotti = new Prodotto [n];
	//
	//for (int i =1; i<n ; i++) {
//		catalogoProdotti[i].toString();
	//}

}
	
	
	


