package overriding;

public class BaseKrediManager {
	//Basenin hesapla metodu burada ezildi. final keywordü eklenerek override(ezilmesi) edilmesi engellenir
	public double hesapla(double tutar){
		return tutar * 1.18;
	}
}
