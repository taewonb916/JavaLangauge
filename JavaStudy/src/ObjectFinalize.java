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
		p1 = null;				// 참조대상을 GC의 대상으로 만듦
		p2 = null;				// 참조대상을 GC의 대상으로 만듦
		
		System.gc();							// GC의 수행 요청
		System.runFinalization(); 				// 보류된 인스턴스의 소멸 요쳥
	}

}
