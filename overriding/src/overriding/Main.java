package overriding;

public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] krediManagers = new BaseKrediManager[] {new Tar�mKrediManager(),new OgretmenKrediManager(), new OgrenciKrediManager()};
		for (BaseKrediManager KrediManager : krediManagers) {
			System.out.println(KrediManager.hesapla(1000)); 
			
		}
	}

}
