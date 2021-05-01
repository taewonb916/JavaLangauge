class Box5 {
	public void wrap() {
		System.out.println("Simple Wrapping");
	}
}

class PaperBox1 extends Box5 {
	public void wrap() {
		System.out.println("Paper Wrapping");
	}
}

class GoldPaperBox1 extends PaperBox1 {
	public void wrap() {
		System.out.println("Gold Wrapping");
	}
}

class WrappingSimple {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box5 box1 = new Box5();
		PaperBox1 box2 = new PaperBox1();
		GoldPaperBox1 box3 = new GoldPaperBox1();
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
	}
	public static void wrapBox(Box5 box) {
		box.wrap();
	}	
}
