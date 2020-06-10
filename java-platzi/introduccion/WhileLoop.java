public class WhileLoop {
	static boolean lightStatus = true;

	public static void main(String[] args) {
		turnOnOffLight();

		int i = 1;		
		while (lightStatus && i <= 10){
			printSOS();
			i++;
		}
	}
	public static void printSOS(){
		System.out.println(". . .  _ _ _  . . .");
	}
	public static boolean turnOnOffLight() {
		lightStatus = (lightStatus)?true:false;
		return lightStatus;
	}
}