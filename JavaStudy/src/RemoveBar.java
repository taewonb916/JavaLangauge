
public class RemoveBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st1 = "990925";
		String st2 = "1012999";
		
		String st3 = st1.concat(String.valueOf('-')).concat(st2);
		System.out.println(st3);
		
		String st4 = st1.concat(String.valueOf(' ')).concat(st2);
		System.out.println(st4);
	}

}
