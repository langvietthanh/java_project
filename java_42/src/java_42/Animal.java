package java_42;

public class Animal {
	protected String name;

	public Animal(String name) {
		this.name = name;
	}
	
	public void sleep() {
		System.out.println("zzz");
	}
	
	public void make_sound() {
		System.out.println(".....");
	}
	
	public void eat () {
		System.out.println("yum yum");
	}
}
