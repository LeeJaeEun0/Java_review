package sec04.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		// return 값을 받기위한 변수
		int result = myCalc.plus(5, 6);
		System.out.println("result: "+ result);
		
		// 자동형변환
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divdie(x, y);
		System.out.println("result2: "+result2);
		
		myCalc.powerOff();
	}

}
