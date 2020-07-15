public class Doctor{
	static int id = 0; //autoincrement
	String name;
	String speciality;

	Doctor(){
		id ++;
	}

	public void showName(){
		System.out.println(name);
	}
	public void showId(){
		System.out.println("ID Doctor: " + id);
	}
}
