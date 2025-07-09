package java_42;

public class Bird extends Animal {

	public Bird() {
		super("Bird");
	}

	@Override
	public void make_sound() {
		System.out.println("chip chip");
	}

	@Override
	public void eat() {
		System.out.println("Bird are eating");
	}
	
	
}
