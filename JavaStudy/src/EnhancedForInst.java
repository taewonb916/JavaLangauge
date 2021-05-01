class Box3 {
	private String contents;
	private int boxNum;
	
	Box3(int num, String cont) {
		boxNum = num;
		contents = cont;
	}
	public int getBox3Num() {
		return boxNum;
	}
	public String toString() {
		return contents;
	}
}

public class EnhancedForInst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box3[] ar = new Box3[5];
		ar[0] = new Box3(101, "Aa");
		ar[1] = new Box3(202, "Bb");
		ar[2] = new Box3(303, "Cc");
		ar[3] = new Box3(404, "Dd");
		ar[4] = new Box3(505, "Ee");
		
		// 배열엥서 번호가 505인 BOX를 찾아 그 내용물을 출력하는 반복문
		for(Box3 e: ar) {
			if(e.getBox3Num() == 505)
				System.out.println(e);
		}
	}	
}
