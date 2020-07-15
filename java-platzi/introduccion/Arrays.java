public class Arrays{
	public static void main(String[] args) {
		String[] androidVersions = new String[]{"Apple Pie"};
		System.out.println(androidVersions[0]);

		String days[] = new String[7];
		days[0] = "Monday";
		days[1] = "Tuesday";
		days[2] = "Wednesday";
		days[3] = "Thursday";
		days[4] = "Friday";
		days[5] = "Saturday";
		days[6] = "Sunday";
		for (int i = 0; i < days.length; i++) {
			System.out.println(days[i]);
		}

		String[][] cities = new String[4][2];
		cities[0][0] = "Colombia";
		cities[0][1] = "Bogota";
		cities[1][0] = "Colombia";
		cities[1][1] = "Medallo";
		cities[2][0] = "Colombia";
		cities[2][1] = "Sta Marta";
		cities[3][0] = "Colombia";
		cities[3][1] = "Valledupar";
		for (int i = 0; i < cities.length; i++){
			for (int j = 0; j < cities[i].length; j++){
				System.out.println(i + j + cities[i][j]);
			}
		}
	}
}
