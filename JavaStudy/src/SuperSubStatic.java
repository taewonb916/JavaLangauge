class SuperCLS2 {
	protected static int count = 0;		// protected�� ���� Ŭ���� ������ ���

	public SuperCLS2() {
			count++;
		}
}

class SubCLS2 extends SuperCLS2 {
	public void ShowCount() {
		// ���� Ŭ������ ��ġ�� Ŭ���� ���� count�� ����
		System.out.println(count);
	}
}

public class SuperSubStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperCLS2 obj1 = new SuperCLS2();		// count �� 1 ����
		SuperCLS2 obj2 = new SuperCLS2();		// count �� 1 ����
		
		// �Ʒ� �ν��Ͻ� ���� �������� SuperCLS ������ ȣ��ǹǷ�,
		SubCLS2 obj3 = new SubCLS2();		// count �� 1����
		obj3.ShowCount();
	}

}
