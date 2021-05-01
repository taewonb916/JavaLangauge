class Cake2 {
	public int size;	// cake size
	
	public Cake2(int sz) {
		size = sz;
	}
	public void showCakeSize() {
		System.out.println("Cake Size " + size);
	}
}

class CheeseCake2 extends Cake2 {
	public int size;
	
	public CheeseCake2(int sz1, int sz2) {
		super(sz1);
		size = sz2;
	}
	public void showCakeSize() {
		// super.size�� ����Ŭ������ ��� size�� �ǹ�
		System.out.println("Cake Size " + super.size);
		
		// size�� �� Ŭ������ ��� size�� �ǹ�
		System.out.println("CheeseCake Size " + size);
	}
}
class YummyCakeSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheeseCake2 ca1 = new CheeseCake2(30, 50);
		Cake2 ca2 = ca1;
		
		// ca2 �� Cake���̹Ƿ� ca2.size�� Cake�� ��� size�� �ǹ���
		System.out.println("Cake Size " + ca2.size);
		
		// ca1 �� CheeseCake���̹Ƿ� ca1.size�� CheeseCake�� ��� size�� �ǹ���
		System.out.println("CheeseCake Size " + ca1.size);
		System.out.println();
		
		ca1.showCakeSize();
		System.out.println();
		ca2.showCakeSize();
		
	}

}
