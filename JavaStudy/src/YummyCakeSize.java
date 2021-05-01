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
		// super.size는 상위클래스의 멤버 size를 의미
		System.out.println("Cake Size " + super.size);
		
		// size는 이 클래스의 멤버 size를 의미
		System.out.println("CheeseCake Size " + size);
	}
}
class YummyCakeSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheeseCake2 ca1 = new CheeseCake2(30, 50);
		Cake2 ca2 = ca1;
		
		// ca2 는 Cake형이므로 ca2.size는 Cake의 멤버 size를 의미함
		System.out.println("Cake Size " + ca2.size);
		
		// ca1 는 CheeseCake형이므로 ca1.size는 CheeseCake의 멤버 size를 의미함
		System.out.println("CheeseCake Size " + ca1.size);
		System.out.println();
		
		ca1.showCakeSize();
		System.out.println();
		ca2.showCakeSize();
		
	}

}
