class Box {
	private String conts;
	
	Box(String cont) {
		this.conts = cont;
		}
	public String toString() {
		return conts;		//���ڿ� ��ȯ
	}
}
public class AutoCallToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder stb = new StringBuilder("12");
		stb.append(34);
		System.out.println(stb.toString());
		System.out.println(stb);
		
		Box box = new Box("Fresh");
		System.out.println(box.toString());
		System.out.println(box);
	}

}
