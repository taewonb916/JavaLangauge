class SuperCLS {
	public SuperCLS() {
		System.out.println("I'm Super Class");
	}
}

class SubCLS extends SuperCLS {
	public SubCLS() {
		System.out.println("I'm Sub Class");
	}
}

public class SuperSunCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SubCLS();
		
	}

}
