package abstract_;
//메소드의 내용이 없는것을 추상 클래스, 다형성: 매소드 이름 동일존재, 사용자마다 다른 기능
abstract class Test01{
	public abstract void speed();// 내년 내후년것도 만들때 추상화(내용만들필요x), 따로 구현해야함
	public void myBreak() {
		System.out.println("멈춤 기능");
	}
}
class Testclass01 extends Test01{
	public void speed() {//추상화한것을 오버라이딩 해야한다
		System.out.println("2025");//다형성
	}
	public void autoSystem() {
		System.out.println("자동 운전 모드");
	}
}
public class Ex01 {
	public static void main(String[] args) {
		Testclass01 t= new Testclass01();
		t.speed(); t.myBreak(); t.autoSystem();
		
	}

}
