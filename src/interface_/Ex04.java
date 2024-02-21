package interface_;
class A04{
	public void aaa() { }
}
class B04 extends A04{
	public void aaa() { }
	public void bbb() { }
	public void ccc() { }
}
public class Ex04 {
	public static void main(String[] args) {
		A04 b= new B04();//부모 것을 만드면 부모것만 보인다. 자식것은 안보인다 
	}
}
