class ParentAdder {
	public int add(int a, int b) {
		return a+b;
	}
}

class ChildAdder extends ParentAdder {
	// @Override�� �������̵��� �Ѵٴ� �� ������ �ؿ� �Ű������� �޶� ������ ������ ��
	public double add(double a, double b) {
		System.out.println("������ �����մϴ�.");
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
