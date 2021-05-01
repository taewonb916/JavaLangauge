class Cake {
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}

class CheeseCake extends Cake {
	public void yummy() {
		System.out.println("Yummy CheeseCake");
	}
}
class YummyCakeOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheeseCake c1 = new CheeseCake();
		Cake c2 = new CheeseCake();
		
		c1.yummy();
		c2.yummy();
	}

}
