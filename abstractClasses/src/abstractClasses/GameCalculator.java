package abstractClasses;
// Abstract sýnýflar asla newlenemez
public abstract class GameCalculator {
		public abstract void hesapla();
		
		
		public final void gameOver() {
			System.out.println("Oyun Bitti");
		}
}
