
public class EnhancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = new int[] {1, 2, 3, 4, 5};
		
		// �迭 ��� ��ü ���
		for(int e : ar)
			System.out.print(e + " ");
		System.out.println();
		
		int sum = 0;
		
		for(int e: ar) 
			sum += e;
		System.out.println(sum);
		
	}
}
