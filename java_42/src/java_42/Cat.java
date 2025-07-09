package java_42;

public class Cat extends Animal{
	public Cat() {
		super("Cat");
	}

	@Override
	public void make_sound() {
		System.out.println("meo meo");
	}

	@Override
	public void eat() {
		System.out.println("Cat are eating");;
	}
	
	
}		
