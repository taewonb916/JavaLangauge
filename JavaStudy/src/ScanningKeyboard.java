import java.util.Scanner;

public class ScanningKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int sum = num1 + num2 + num3;
		System.out.printf("%d + %d + %d = %d", num1, num2 ,num3, sum);
	}

}
