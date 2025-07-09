package java_42;

public class Dog extends Animal{
	public Dog() {
		super("Dog");
	}

	@Override
	public void make_sound() {
		System.out.println("gau gau");
	}

	@Override
	public void eat() {
		System.out.println("Dog are eating");
	}
	
	
}
