package sec05.exam04;

public class SingletonExample {

	public static void main(String[] args) {
		//메서드를 통해서만 객체를 생성할 수 있음
		Singleton obj1 = Singleton.getInstance(); 
		Singleton obj2 = Singleton.getInstance(); 

		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		}else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
	}

}
