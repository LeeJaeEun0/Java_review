package sec03.exam02;

public abstract class Animal { // 추상클래스
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public void sound() { //추상화 -> 상속받으면 반드시 오버라이딩 필요, 안하면 오류 발생
		
	}
}
