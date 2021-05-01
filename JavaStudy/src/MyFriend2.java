class Friend {
	private String name;
	private String phone;
	
	public Friend(String na, String ph) {
		name = na;
		phone = ph;
	}
	
	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("전화: " + phone);
	}
}

class UnivFriend2 extends Friend {
	private String major;
	
	public UnivFriend2(String na, String ph, String ma) {
		super(na, ph);
		major = ma;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("전공: " + major);
	}
}

class CompFriend2 extends Friend {
	private String department;
	
	public CompFriend2(String na, String ph, String de) {
		super(na, ph);
		department = de;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("부서: " + department);		
	}
}

class MyFriend2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friend[] frs = new Friend[10];
		int frsn = 0;
		
		frs[frsn++] = new UnivFriend2("Park", "Computer", "010-1111-2222");
		frs[frsn++] = new UnivFriend2("Kim", "Engineering", "010-2222-3333");	
		frs[frsn++] = new CompFriend2("Lee", "R&D 1", "010-3333-4444");
		frs[frsn++] = new CompFriend2("Yoon", "R&D 2", "010-4444-5555");
		
		for(int i = 0; i < frsn; i++) {
			frs[i].showInfo();
			System.out.println();
		}
	}

}
