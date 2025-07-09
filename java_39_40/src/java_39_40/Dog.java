package java_39_40;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}
	
	public void Brak (String food) {
		if (food == "meat")System.out.println("gau gau");
		else System.out.println("not dog food");
	}
}
