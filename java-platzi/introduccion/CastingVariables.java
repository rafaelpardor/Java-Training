// Cast automatico
// byte -> short -> int -> long -> float -> double
// char -> int

// Requiere un cast
// double -> float -> long -> int -> short -> byte
// int -> char || char <-> long char <-> byte
public class CastingVariables{
	public static void main(String[] args) {
		// En un anio ubique 30 perros
		// Cuantos perros ubique al mes
		double MONTHS = 12;
		double monthlyDogs = 30/MONTHS;
		System.out.println(monthlyDogs);
		// Cast
		int castMonthlyDogs = (int)monthlyDogs;
		System.out.println(castMonthlyDogs);

		char n = '1';
		int nInt = n;
		System.out.println(nInt);

		short nShort = (short)n;
		System.out.println(nShort);
	}
}