class Cake6 {
	public String toString() {
		System.out.println(super.toString());
		return "My Birthday Cake";
		}
}

class CheeseCake6 extends Cake6{
	public String toString() {
		return "My Birthday Cheese Cake";
	}
}

class OverridingToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cake6 c1 = new Cake6();
		Cake6 c2 = new CheeseCake6();
		
		System.out.println(c1);
		System.out.println();
		
		System.out.println(c2);
	}

}
