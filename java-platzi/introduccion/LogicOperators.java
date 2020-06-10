public class LogicOperators {
	public static void main(String[] args) {
		int a = 8; 
		int b = 5;

		System.out.println("a es igual a b? -> " + (a ==b));
		
		if (a == b) {
			System.out.println("a es igual a b");
		} else if (a != b) {
			System.out.println("a es diferente a b");
		} else if (a > b) {
			System.out.println("a es mayor que b");
		} else if (a < b) {
			System.out.println("a es menor que b");
		} else if ( a >= b) {
			System.out.println("a es igual o mayor a b");
		} else if ( a <= b) {
			System.out.println("a es igual o menor a b");
		} else {
			System.out.println("I see you at work");
		}
	}
}