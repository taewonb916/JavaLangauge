class Person3 {
	String name;
	
	public Person3(String name) {
		this.name = name;
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("destroyed: " + name);
	}
}

class ObjectFinalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person3 p1 = new Person3("Park");
		Person3 p2 = new Person3("Kim");
		p1 = null;				// ��������� GC�� ������� ����
		p2 = null;				// ��������� GC�� ������� ����
		
		System.gc();							// GC�� ���� ��û
		System.runFinalization(); 				// ������ �ν��Ͻ��� �Ҹ� �䫊
	}

}
