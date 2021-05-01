class SuperClass {
	public SuperClass() {
		System.out.println("Con: SuperClass()");
	}
	public SuperClass(int i) {
		System.out.println("Con: SuperClass(int i)");		
	}
	public SuperClass(int i, int j) {
		System.out.println("Con: SuperClass(int i, int j)");
	}
}

class SubClass extends SuperClass {
	public SubClass() {
		System.out.println("Con: SubClass()");
	}
	public SubClass(int i) {
		super(i);
		System.out.println("Con: SubClass(int i)");
	}
	public SubClass(int i, int j) {
		super(i, j);
		System.out.println("Con: SubClass(int i, int j)");
	}
}

class SuperSubCon2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. ");
		new SubClass();
		System.out.println();
		
		System.out.println("2. ");
		new SubClass(1);
		System.out.println();
		
		System.out.println("3. ");
		new SubClass(1, 2);
		System.out.println();
		
	}

}
