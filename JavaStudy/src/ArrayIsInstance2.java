class Box1 {
	private String conts;
	
	Box1(String cont) {
		this.conts = cont;
	}
	public String toString() {
		return conts;
	}
}

public class ArrayIsInstance2 {

	public static void main(String[] args) {
		Box1[] ar = new Box1[5];							// 길이가 5인 Box형 1차원 배열의 생성
		System.out.println("length: " + ar.length);		// length : 5
	}

}
