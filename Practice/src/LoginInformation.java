import java.util.Scanner;

public class LoginInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sa = new Scanner(System.in);
		
		System.out.print("ID 설정 :");
		String ids = sc.nextLine();
		
		System.out.print("PW 설정 :");
		String pws = sc.nextLine();
		

		for(int i = 1; i <= 6; i++) {
			if(i == 6) {
				System.out.println("로그인 할 수 없습니다.");
				break;
			}
			System.out.print("ID: ");
			String id = sa.nextLine();
			
			System.out.print("PW: ");
			String pw = sa.nextLine();
			
			if(ids.equals(id)) {
				if(pws.equals(pw)) {
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
