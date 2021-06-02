package packagesDemo;

import java.util.Scanner;

import matematik.*;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Adýnýz : ");
		
		String isim = scanner.nextLine();
		
		System.out.println("Merhaba "+ isim);
		
		DortIslem dortIslem = new DortIslem();
		dortIslem.topla(4, 7);
		
		Logoritma logoritma = new Logoritma();
		logoritma.logoritmaHesapla();
	}

}
