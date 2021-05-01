class Cake1 {
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}

class CheeseCake1 extends Cake1 {
	public void yummy() {
		super.yummy();
		System.out.println("Yummy CheeseCake");
	}
	public void tasty() {
		super.yummy();
		System.out.println("Yummy Tasty Cake");
	}
}
class YummyCakeSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheeseCake1 c1 = new CheeseCake1();
		
		c1.yummy();
		c1.tasty();
	}

}
