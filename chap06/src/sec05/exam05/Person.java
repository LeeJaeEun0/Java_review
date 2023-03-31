package sec05.exam05;

public class Person {
	final String nation = "Korea"; // 값을 넣으면 고정
	final String ssn; // 선언만 함 -> 값을 넣으면 그 값이 고정됨
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
