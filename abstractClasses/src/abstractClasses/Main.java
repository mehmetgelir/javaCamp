package abstractClasses;

public class Main {

	public static void main(String[] args) {
		
		WomenGameCalculator womenGameCalculator = new WomenGameCalculator();
		womenGameCalculator.hesapla();
		womenGameCalculator.gameOver();
		
		ManGameCalculator manGameCalculator = new ManGameCalculator();
		manGameCalculator.hesapla();
		manGameCalculator.gameOver();
		
		KidsGameCalculator kidsGameCalculator = new KidsGameCalculator();
		kidsGameCalculator.hesapla();
		kidsGameCalculator.gameOver();
		
		OlderGameCalculator olderGameCalculator = new OlderGameCalculator();
		olderGameCalculator.hesapla();
		olderGameCalculator.gameOver();

	}

}
