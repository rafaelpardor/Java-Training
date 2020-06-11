public class ForStatement{
	static boolean lightStatus = true;

	public static void main(String[] args) {
		turnOnOffLight();

	for (int i = 0; 1<= 10; i++ ) {
		printSOS();
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