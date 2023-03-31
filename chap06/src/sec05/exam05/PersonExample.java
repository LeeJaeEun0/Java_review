package sec05.exam05;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-123456", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation ="usa";// The final field Person.nation cannot be assigned
		p1.name="홍심원";
		System.out.println(p1.name);

	}

}
