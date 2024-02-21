package upcasting;
class Test{}
public class Ex03 {
	public static void main(String[] args) {
		Object num = 100;// 최고 조상 , 받을때는 편하지만 사용시는 원래 형태로
		Object name = "홍길동";
		Object t = new Test();
		System.out.println(num.getClass());
		System.out.println(name.getClass());
		
		int a = 100+(int)num;//object와 정수는 연산 불가, 다시 자기 자신으로 쓸때 downcasting
		//num 앞에(int)를 붙여야한다
		System.out.println(a);
	}

}
