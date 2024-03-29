package sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		// 같은 객체를 참고 - 객체의 주소를 비교
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조과 같음");
		}else {
			System.out.println("strVar1과 strVar2는 참조과 다름");
		}
		
		// 둘의 내용이 같은지 확인
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		// 둘다 다른 객체를 참조 - 객체의 주소를 비교
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조과 같음");
		}else {
			System.out.println("strVar3과 strVar4는 참조과 다름");
		}
		
		// 둘의 내용이 같은지 확인
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
	}

}
