package arrayListTypedDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> sehirler = new ArrayList<String>();
		sehirler.add("Ankara");
		sehirler.add("Bilecik");
		sehirler.add("izmir");
		sehirler.add("Aydýn");
		
		//sehirler.remove(0);
		Collections.sort(sehirler);		
		
		for (String sehir : sehirler) {
			System.out.println(sehir);
		}

	}

}
