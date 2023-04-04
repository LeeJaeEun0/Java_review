package sec03.exam02;

public class AnimalExample {
	public static void main(String[] args) {
		// 객체를 생성해서 메소드 실행
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("-------");
		
		// 변수의 자동 타입 변환
		Animal animal = null; // 변수 타입 선언
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("-------");
		
		// 메소드의 다형성
		animalSond(new Dog());
		animalSond(new Cat());
	}

	public static void animalSond(Animal animal) {
		animal.sound();
		
	}
}
