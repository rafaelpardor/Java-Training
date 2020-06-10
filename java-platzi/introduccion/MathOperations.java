public class MathOperations{
	public static void main(String[] args) {
		double x = 2.1;
		double y = 3;

		// Aproxima hacia el numero mas grande
		System.out.println("Aproxima " + x + " hacia el numero mas grande: "
		 	+ Math.ceil(x));

		// Aproxuma hacia el numero hacia abajo
		System.out.println("Aproxima " + x + " hacia el numero mas pequeno: "
			+ Math.floor(x));

		System.out.println("Potencia - " + Math.pow(y, y));

		System.out.println("Raiz cuadrada de " + y +": " +
			Math.sqrt(y));

		System.out.println(Math.max(x, y));

		// Area de un circulo
		// PI * r^2
		System.out.println("Area de un circulo de radio " + y + ": "
			+ Math.PI * Math.pow(y, 2));

		// Area de una esfera
		// 4*PI*r^2
		System.out.println("Area de una esfera de radio " + y + ": "
			+ 4 * 3.14 * Math.pow(y, 2));

		// Volumen de una esfera
		// (4/3)*PI * r^3
		System.out.println("Volumen de una esfera de radio " + y + ": "
			+ (4/3) * 3.14 * Math.pow(y, 3));
	}
}