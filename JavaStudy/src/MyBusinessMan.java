class Man {
	String name;
	public void tellYourName() {
		System.out.println("My name is " + name);
	}
}

class BusinessMan extends Man {
	String company;
	String position;
	
	public BusinessMan(String name, String company, String position) {
		// ���� Ŭ���� Man�� ��� �ʱ�ȭ
		this.name = name;
		
		// ���� Ŭ���� BusinessMan�� ��� �ʱ�ȭ
		this.company = company;
		this.position = position;
		
	}
	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
		tellYourName();
	}
}	

class MyBusinessMan {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusinessMan man = new BusinessMan("park", "ABC", "engineer");
		man.tellYourInfo();
	}

}