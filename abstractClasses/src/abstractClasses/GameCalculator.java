package abstractClasses;
// Abstract s�n�flar asla newlenemez
public abstract class GameCalculator {
		public abstract void hesapla();
		
		
		public final void gameOver() {
			System.out.println("Oyun Bitti");
		}
}
