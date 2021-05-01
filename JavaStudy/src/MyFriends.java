class UnivFriend {
	private String name;
	private String major;
	private String phone;
	
	public UnivFriend(String na, String ma, String ph) {
		name = na;
		major = ma;
		phone = ph;
	}
	
	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("전공: " + major);
		System.out.println("전화: " + phone);
	}
}

class CompFriend {
	private String name;
	private String department;
	private String phone;
	
	public CompFriend(String na, String de, String ph) {
		name = na;
		department = de;
		phone = ph;
	}
	
	public void ShowInfo() {
		System.out.println("이름: " + name);
		System.out.println("부서: " + department);
		System.out.println("전화: " + phone);
	}
	
}
class MyFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnivFriend[] ufrns = new UnivFriend[5];
		int unct = 0;
		
		CompFriend[] cfrns = new CompFriend[5];
		int ccnt = 0;
		
		ufrns[unct++] = new UnivFriend("Park", "Computer", "010-1111-2222");
		ufrns[unct++] = new UnivFriend("Kim", "Engineering", "010-2222-3333");
		
		cfrns[ccnt++] = new CompFriend("Lee", "R&D 1", "010-3333-4444");
		cfrns[ccnt++] = new CompFriend("Yoon", "R&D 2", "010-4444-5555");
		
		for(int i = 0; i < unct; i++)
			ufrns[i].showInfo();
		for(int j = 0; j < ccnt; j++)
			cfrns[j].ShowInfo();
		
	}

}
