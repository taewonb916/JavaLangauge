import java.util.Scanner;
import java.util.InputMismatchException;

class ExceptionCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		try {
			System.out.println("a/b...a?");
			int n1 = kb.nextInt();
			System.out.println("a/b...b?");
			int n2 = kb.nextInt();
			System.out.printf("%d / %d = %d \n", n1, n2, n1/n2);
		}
		catch(ArithmeticException | InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Good Bye~");
	}

}
