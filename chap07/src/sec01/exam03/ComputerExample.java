package sec01.exam03;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원면적 : " +calculator.areaCircle(r));
		
		Computer computer = new Computer();
		System.out.println("원면적 : " +calculator.areaCircle(r)); // 재정의된 메소드 호출
		//부모와 자식에게 동일한 메소드가 있으면 자식의 메소드를 실행

	}

}
