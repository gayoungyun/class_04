package upcasting;//casting : 형변환 자식에서 부모로 변환 , 반대는 downcasting
class A01{
	public void test() {
		System.out.println("aaaaa");
	}
}
class B01 extends A01{
	public void test() {
		System.out.println("bbbbb");
	}
	public void test1()// 상속받지 않은것
	{
		
	}
}
class C01 extends A01{
	public void test() {
		System.out.println("ccccc");
	}
}
public class Ex01 {
	public static void main(String[] args) {
		A01 a;//A01먼저 찾아가서 찾는다-오버라이드해서 자식꺼에서 출력
		a = new B01(); a.test();//자식형태에서 부모 형태에 저장 upcasting
		//a.test1();//상속받아서 형변환한것만 가능하다
		a = new C01(); a.test();
		
		/*
		B01 b;
		C01 c;
		b= new B01(); b.test();
		c= new C01(); c.test();
		*/
	}

}
