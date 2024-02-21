package overriding;

import java.util.ArrayList;

class Test02 extends ArrayList<String>{//참고
	public String get(int i) {//오버라이딩
		System.out.println(super.get(i));
		return super.get(i);
	}

	@Override
	public boolean add(String e) {
		System.out.println("저장되었습니다");//add가 동작될때마다 출력
		return super.add(e);
	}
	
}
public class Ex02 {
	public static void main(String[] args) {
		Test02 t= new Test02();
		t.add("111");
		t.add("222");
		t.add("333");
		t.get(2);
		
	}

}
