package singleton;
class Test03{
	private static Test03 t;// static객체 접근을 위해서
	int num;
	private Test03() {
		System.out.println("생성자 실행");
	}
	public static Test03 getInstance() {//최초 null
		System.out.println("객체생성 메소드 연동");
		System.out.println("t : "+t);
		if(t == null)
			t= new Test03();
		//t = new Test03();// 위에도 static하면 t사용 가능
		return t;
	}
}
public class Ex03 {
	public static void main(String[] args) {
		Test03 t01 = Test03.getInstance();
		Test03 t02 = Test03.getInstance();
		Test03 t03 = Test03.getInstance();
		t01.num = 1000; t02.num = 2000;//최초 1000 다음부터는 2000
		System.out.println(t01+" : "+t01.num);
		System.out.println(t02+" : "+t02.num);
		System.out.println(t03+" : "+t03.num);
		
		//Test03.객체생성메소드();//static 사용해서 class받아올 수 있다, 최초 null
		//Test03.객체생성메소드();// 다음부터는 객체의 내용
		//Test03.객체생성메소드();// 
	}

}
