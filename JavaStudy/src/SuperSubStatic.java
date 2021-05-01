class SuperCLS2 {
	protected static int count = 0;		// protected는 하위 클래스 접근을 허용

	public SuperCLS2() {
			count++;
		}
}

class SubCLS2 extends SuperCLS2 {
	public void ShowCount() {
		// 상위 클래스에 위치한 클래스 변수 count에 접근
		System.out.println(count);
	}
}

public class SuperSubStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperCLS2 obj1 = new SuperCLS2();		// count 값 1 증가
		SuperCLS2 obj2 = new SuperCLS2();		// count 값 1 증가
		
		// 아래 인스턴스 생성 과정에서 SuperCLS 생성자 호출되므로,
		SubCLS2 obj3 = new SubCLS2();		// count 값 1증가
		obj3.ShowCount();
	}

}
