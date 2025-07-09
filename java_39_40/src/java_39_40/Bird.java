package java_39_40;

public class Bird extends Animal {
	public Bird(String name) {
		super(name);
	}
	public void Bird_speak(String food ) {
		if (food == "fish")System.out.println("chip chip");
		else System.out.println("not bird food");
	}
}
