import java.util.Scanner;

public class LoginInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sa = new Scanner(System.in);
		
		System.out.print("ID ���� :");
		String ids = sc.nextLine();
		
		System.out.print("PW ���� :");
		String pws = sc.nextLine();
		

		for(int i = 1; i <= 6; i++) {
			if(i == 6) {
				System.out.println("�α��� �� �� �����ϴ�.");
				break;
			}
			System.out.print("ID: ");
			String id = sa.nextLine();
			
			System.out.print("PW: ");
			String pw = sa.nextLine();
			
			if(ids.equals(id)) {
				if(pws.equals(pw)) {
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
