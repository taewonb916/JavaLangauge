
public class BuildString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ڿ� "123"�� ����� �ν��Ͻ��� ����
		StringBuilder stbuf = new StringBuilder("123");
		
		stbuf.append(45678);						// ���ڿ� �����̱�
		System.out.println(stbuf.toString());
		
		stbuf.delete(0, 2);							// ���ڿ� �Ϻ� ����
		System.out.println(stbuf.toString());
		
		stbuf.replace(0, 3, "AB");					// ���ڿ� �Ϻ� ��ü
		System.out.println(stbuf.toString());
		
		stbuf.reverse();							// ���ڿ� ���� ������
		System.out.println(stbuf.toString());
		
		String sub = stbuf.substring(2, 4);			// �Ϻθ� ���ڿ��� ��ȯ
		System.out.println(sub);
	}

}
