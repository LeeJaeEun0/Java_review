package sec02.exam03;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 1000000000000000; 
		//컴파일 에러(he literal 1000000000000000 of type int is out of range )
		// 숫자 뒤에 L이라고 표기해야 Long로 본다
		long var4 = 100000000000000000L; 
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);

	} // end of main

} // end of class
