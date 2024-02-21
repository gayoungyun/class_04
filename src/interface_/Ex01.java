package interface_;
interface A01{
	public void test1();//코드가 없어야지 인터페이스 만들수 있다{}없이, 실체화해야함
}
interface B01{
	public void test1();
}
class Class01{}
class Class02{}
public class Ex01 extends Class01 implements A01, B01{
	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}
	

}
