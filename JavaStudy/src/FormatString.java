
public class FormatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 30;
		double height = 178.2;
		String name = "PTW";
		
		System.out.printf("name : %s \n", name);
		System.out.printf("Age : %d \n Height : %e \n\n", age, height);
		
		System.out.printf(" %d - %o - %x \n\n", 77, 77, 77);
		System.out.printf("%g \n", 0.00014);
		System.out.printf("%g \n", 0.000000000014);
	}

}
