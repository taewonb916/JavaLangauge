class ParentAdder {
	public int add(int a, int b) {
		return a+b;
	}
}

class ChildAdder extends ParentAdder {
	// @Override는 오버라이딩을 한다는 뜻 하지만 밑에 매개변수가 달라서 컴파일 에러로 뜸
	public double add(double a, double b) {
		System.out.println("덧셈을 진행합니다.");
		return a+b;
	}
}
class OverrideMistake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentAdder pa = new ParentAdder();
		ParentAdder pa1 = new ChildAdder();
		ChildAdder pa2 = new ChildAdder();
		
		System.out.println(pa.add(3, 2));
		System.out.println(pa1.add(3, 5));
		System.out.println(pa2.add(2.1, 3.1));
	}

}
