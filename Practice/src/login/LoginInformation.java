package login;
import java.util.Scanner;

public class LoginInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ConstructorIdPw idpw = new ConstructorIdPw();
		
		System.out.print("ID ¼³Á¤ : ");
		idpw.constructorId();
		idpw.constructorPw();
		
		System.out.println("Do you want login?");
		System.out.println("1. Yes 2. No");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("Please Login");
			idpw.checkIdPw();
		}
		else if(choice == 2)  
			System.out.println("See you next time");		
		}
	}



		
	