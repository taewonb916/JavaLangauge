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
		System.out.println("비밀번호는 8~10자 사이로 설정해주세요.");
		System.out.print("PW 설정 :");
		String pws = sc.nextLine();
		
		for(int k = 0; k <= 10; k++) {
			if(pws.length() < 10 && pws.length() > 8) {
				System.out.println("비밀번호 설정이 완료되었습니다");
			break;
			}
			else  {
				System.out.print("비밀번호를 다시 설정해주세요.");
				System.out.println("기회가 " + (10-k) + "회 남았습니다.");
				System.out.print("PW 설정 :");
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
				System.out.println("로그인 할 수 없습니다.");
				break;
			}
			System.out.print("ID: ");
			String idr = sc.nextLine();
		
			System.out.print("PW: ");
			String pwr = sc.nextLine();
		
			if(rid.equals(idr)) {
				if(rpw.equals(pwr)) {
					System.out.println("로그인 완료.");
					break;
			}
			
			else {
				System.out.println("잘못된 비밀번호입니다. (" + i + " 회 틀렸습니다 5회 틀릴 시 로그인이 불가능해집니다.)");
				continue;
			}
		}	
			
		else {
			System.out.println("없는 아이디 입니다." + " (" + i + " 회 틀렸습니다 5회 틀릴 시 로그인이 불가능해집니다.)");
			continue;
			}	
		}			
	}
}



