package sec01.exam01;

public class VariableIntializationExample {

	public static void main(String[] args) {
		int value;
		int result = value +10;
		System.out.println(result); // 일부러 에러발생
		//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//The local variable value may not have been initialized
	} // end of main

} // end of class
