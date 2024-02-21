package overriding;
class TestDTO{
	String name;
	int age;
	@Override
	public String toString() {//저장된것을 확인, DTO에 많이 작성
		return "[name : "+name+", age : "+age+"]";
	}
	
}
class Test06{
	TestDTO t;
	public Test06() {
		t= new TestDTO();
	}
	public void setDTO() {
		t.name = "홍길동"; t.age = 200;
	}
	public void print() {
		System.out.println(t.name);
		System.out.println(t.age);
		System.out.println("------------");
		System.out.println(t.toString());
		System.out.println(t);
		
	}
}
public class Ex06 {
	public static void main(String[] args) {
		Test06 t = new Test06();
		t.setDTO(); t.print();
	}

}
