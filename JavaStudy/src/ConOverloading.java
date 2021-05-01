class Person {
	private int regiNum;	// �ֹε�Ϲ�ȣ
	private int passNum;	// ���ǹ�ȣ
	
	Person(int rnum, int pnum) {
		regiNum = rnum;
		passNum = pnum;
	}
	
	Person(int rnum) {
		regiNum = rnum;
		passNum = 0;
	}
	void showPersonalInfo() {
		System.out.println("�ֹε�Ϲ�ȣ : " + regiNum);
		
		if(passNum != 0)
			System.out.println("���ǹ�ȣ : " + passNum + '\n');
		else
			System.out.println("������ ������ ���� �ʽ��ϴ�" + '\n');
	}
}

public class ConOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� �ִ� ����� ������ ���� �ν��Ͻ��� ����
		Person jung = new Person(335577, 112233);
		
		//���� ���� ����� ������ ���� �ν��Ͻ��� ����
		Person park = new Person(113355);
		
		jung.showPersonalInfo();
		park.showPersonalInfo();
	}

}
