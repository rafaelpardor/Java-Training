import java.util.Scanner;
public class DoWhile {
	public static void main(String[] args) {
		int response = 0;
		do {
			System.out.println("Selecciona un numero");	
			System.out.println("1. Juegos");
			System.out.println("2. Series");
			System.out.println("0. Salir");	

			Scanner sc = new Scanner(System.in);
			response = Integer.valueOf(sc.nextLine());

			switch (response) {
				case 1:
					System.out.println("--Juegos--");
					break;
				case 2:
					System.out.println("--Series--");
					break;
				case 0:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Selecciona una opcion correcta");

			}
		}while(response != 0);
		System.out.println("Adios!");
	}
}