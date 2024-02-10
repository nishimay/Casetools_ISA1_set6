
public class Vegetable {

	String name;
	Vegetable(String name){
		this.name=name;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vegetable spinach= new Vegetable("spinach");
		System.out.println("Vegetable is"+spinach.name);
	}
	
	String getType()
	{
		return name;
	}

}
