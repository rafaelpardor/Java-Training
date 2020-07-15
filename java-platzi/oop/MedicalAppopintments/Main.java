
public class Main{
	public static void main(String[] args) {
		Doctor doctor1 = new Doctor();
		doctor1.name = "Rafael";
		doctor1.speciality = "Open Hearth Cirgury";
		doctor1.showName();
		doctor1.showId();

		Doctor doctor2 = new Doctor();
		doctor2.showId();

		UIMenu.showMenu();
	}
}