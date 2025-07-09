package java_42;

public class Test {
	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		Bird b = new Bird();
		d.eat();
		d.make_sound();
		d.sleep();
		System.out.println("-----");
		c.eat();
		c.make_sound();
		c.sleep();
		System.out.println("-----");
		b.eat();
		b.make_sound();
		b.sleep();
	}
}
