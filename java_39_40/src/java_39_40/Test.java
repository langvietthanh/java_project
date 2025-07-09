package java_39_40;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String food = inp.next();
		Dog dog1 = new Dog ("khach");
		dog1.Run();
		dog1.Brak(food);
		BabyDog dog2 = new BabyDog("quanli");
		dog2.Run();
		dog2.Walk();
		dog2.Brak(food);
		Cat cat1 = new Cat("kevin");
		cat1.Run();
		cat1.Cat_speak(food);
		Bird bird1 = new Bird("mark");
		bird1.Run();
		bird1.Bird_speak(food);
	}
}
