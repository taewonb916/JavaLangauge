package login;
import java.util.Scanner;

public class ConstructorIdPw {
	static String rid;
	static String rpw;
	public void constructorId() {
		Scanner sc = new Scanner(System.in);	
		String ids = sc.nextLine();
		rid = ids;
	}
	
	public void constructorPw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��й�ȣ�� 8~10�� ���̷� �������ּ���.");
		System.out.print("PW ���� :");
		String pws = sc.nextLine();
		
		for(int k = 0; k <= 10; k++) {
			if(pws.length() < 10 && pws.length() > 8) {
				System.out.println("��й�ȣ ������ �Ϸ�Ǿ����ϴ�");
			break;
			}
			else  {
				System.out.print("��й�ȣ�� �ٽ� �������ּ���.");
				System.out.println("��ȸ�� " + (10-k) + "ȸ ���ҽ��ϴ�.");
				System.out.print("PW ���� :");
				pws = sc.nextLine();
				rpw = pws;
						}
					}
			}
	
	public void checkIdPw() {
		Scanner sc = new Scanner(System.in);
		String id = rid;
		String pw = rpw;
		
		for(int i = 1; i <= 6; i++) {
			if(i == 6) {
				System.out.println("�α��� �� �� �����ϴ�.");
				break;
			}
			System.out.print("ID: ");
			String idr = sc.nextLine();
		
			System.out.print("PW: ");
			String pwr = sc.nextLine();
		
			if(rid.equals(idr)) {
				if(rpw.equals(pwr)) {
					System.out.println("�α��� �Ϸ�.");
					break;
			}
			
			else {
				System.out.println("�߸��� ��й�ȣ�Դϴ�. (" + i + " ȸ Ʋ�Ƚ��ϴ� 5ȸ Ʋ�� �� �α����� �Ұ��������ϴ�.)");
				continue;
			}
		}	
			
		else {
			System.out.println("���� ���̵� �Դϴ�." + " (" + i + " ȸ Ʋ�Ƚ��ϴ� 5ȸ Ʋ�� �� �α����� �Ұ��������ϴ�.)");
			continue;
			}	
		}			
	}
}



