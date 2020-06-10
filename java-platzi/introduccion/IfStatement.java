public class IfStatement{
	public static void main(String[] args) {
		boolean isBluetoothEnabled = false;

		if (isBluetoothEnabled) {
			System.out.println("Archivo Enviado");
		} else {
			System.out.println("Bluetooth no encendido");
			isBluetoothEnabled = true;
			System.out.println("Archivo Enviado");
		}
	}
}