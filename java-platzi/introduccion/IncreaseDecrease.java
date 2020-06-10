public class IncreaseDecrease{
	public static void main(String[] args) {
		int lives = 5;
		lives = lives - 1;
		System.out.println(lives);

		lives--;
		System.out.println(lives);

		lives++;
		System.out.println(lives);

		// Prefijo
		int gift = 100 + lives++; // posfijo
		System.out.println(gift);
		System.out.println(lives);	
	}
}