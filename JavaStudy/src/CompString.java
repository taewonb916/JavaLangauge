
public class CompString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st1 = "Lexicographically";
		String st2 = "lexicographically";
		int cmp;
		
		if(st1.equals(st2))
			System.out.println("���ڿ��� ������ �����ϴ�.");
		else
			System.out.println("���ڿ��� ������ �ٸ��ϴ�");
		
		if(st1.compareTo(st2) == 0)
			System.out.println("�� ���ڿ��� ��ġ�մϴ�");
		else if(st1.compareTo(st2) < 0)
			System.out.println("���� �տ� �� �ܾ�: " + st1);
		else
			System.out.println("���� �տ� �� �ܾ�: " + st2);
		
		cmp = st1.compareToIgnoreCase(st2);
		
		if(cmp == 0)
			System.out.println("�� ���ڿ��� �����ϴ�");
		else
			System.out.println("�� ���ڿ��� �ٸ��ϴ�");
	}

}
