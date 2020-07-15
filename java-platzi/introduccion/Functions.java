public class Functions {
  public static void main(String[] args) {
    double radius1 = 10;
    double area1 = circleArea(radius1);
    System.out.println(area1);

    greets("Rafael");
  }

	/**
	* circleArea: Calcula el area de un circulo
	* @param r radius
	*/
	public static double circleArea(double r){
		return Math.PI * Math.pow(r, 2);
	}
	public static void greets(String name){
		System.out.println("Hello, " + name);
	}
}
