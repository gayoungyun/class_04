package interface_;

public class Ex07 {
	public static void main(String[] args) {//인터페이스 코드 수정이 줄음
		Testint07 t01 = Singleton07.getInstatnce();
		Testint07 t02 = Singleton07.getInstatnce();
		Testint07 t03 = Singleton07.getInstatnce();
		Testint07 t04 = Singleton07.getInstatnce();
		
		t01.test();
		/*
		Testint07 t01 = new TestClass07_1();
		Testint07 t02 = new TestClass07_1();
		Testint07 t03 = new TestClass07_1();
		Testint07 t04 = new TestClass07_1();
		Testint07 t05 = new TestClass07_1();
		*/
	}

}
