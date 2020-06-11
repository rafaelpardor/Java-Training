public class Arrays{
	public static void main(String[] args) {
		String[] androidVersions = new String[]{"Apple Pie"};
		System.out.println(Arrays.toString(androidVersions));

		String days[] = new String[7];
		days[0] = "Monday";
		days[1] = "Tuesday";
		days[2] = "Wednesday";
		days[3] = "Thursday";
		days[4] = "Friday";
		days[5] = "Saturday";
		days[6] = "Sunday";
		for (int i = 0; i <= days.length-1; i++) {
			System.out.printl(days[i]);
		}
	}
}