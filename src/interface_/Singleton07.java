package interface_;

public class Singleton07 {
	private static Testint07 t;
	private Singleton07() {};
	public static Testint07 getInstatnce() {
		if(t == null) {
			t = new TestClass07_1();
		}
		return t;
	}
}
