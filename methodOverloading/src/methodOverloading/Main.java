package methodOverloading;

public class Main {

	public static void main(String[] args) {
		
		
		DortIslem dortIslem = new DortIslem();
		dortIslem.topla(2, 3,4);
		dortIslem.topla(2, 4);
		
		System.out.println(dortIslem.topla(2,4, 1));
		System.out.println(dortIslem.topla(2,4));

	}

}
