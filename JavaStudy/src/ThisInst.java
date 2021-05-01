class SimpleBox {
	private int data;
	
	SimpleBox(int data) {
		this.data = data;
	}
	void setData(int data) {
		this.data = data;
	}
	int getData() {
		return this.data;
	}
}

public class ThisInst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleBox box = new SimpleBox(99);
		System.out.println(box.getData());
		
		box.setData(77);
		System.out.println(box.getData());
	}

}
