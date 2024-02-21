package overriding;
class Test05{
	
}
public class Ex05 {
	public static void main(String[] args) {
		Test05 t = new Test05();
		System.out.println("aaa".getClass());//오브젝트:어떤 자료형으로 만들어 진지 알려주는
		System.out.println(t.getClass());
		System.out.println(t.toString());//오버라이딩으로 많이 쓴다
		System.out.println(t);// 위와 같게 나온다
	}

}
