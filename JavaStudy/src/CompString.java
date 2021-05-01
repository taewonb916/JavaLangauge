
public class CompString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st1 = "Lexicographically";
		String st2 = "lexicographically";
		int cmp;
		
		if(st1.equals(st2))
			System.out.println("문자열의 내용이 같습니다.");
		else
			System.out.println("문자열의 내용이 다릅니다");
		
		if(st1.compareTo(st2) == 0)
			System.out.println("두 문자열은 일치합니다");
		else if(st1.compareTo(st2) < 0)
			System.out.println("사전 앞에 올 단어: " + st1);
		else
			System.out.println("사전 앞에 올 단어: " + st2);
		
		cmp = st1.compareToIgnoreCase(st2);
		
		if(cmp == 0)
			System.out.println("두 문자열을 같습니다");
		else
			System.out.println("두 문자열은 다릅니다");
	}

}
