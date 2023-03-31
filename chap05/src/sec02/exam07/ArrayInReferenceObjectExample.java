package sec02.exam07;

public class ArrayInReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		
		
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println(strArray[0] == strArray[1]); // 0과 1은 같은 객체를 참조
		System.out.println(strArray[0] == strArray[2]);// 0과 2은 다른 객체를 참조
		System.out.println(strArray[0].equals(strArray[2])); // 문자열을 비교

	}

}
