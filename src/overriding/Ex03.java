package overriding;
final class Test03{//final은 상속받을 수 없습니다(잘 사용x)
	public void test() {
		System.out.println("test03의 test 기능");
	}
}
class TestClass03{//부모가 아니라 자기자신 출력
	Test03 t = new Test03(); // final이있으면 extends 가 아니라 new사용
	public void test() {
		t.test();
		System.out.println("class03 test 기능");
	}
}

public class Ex03 {
	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
		t.test();
		
	}

}
