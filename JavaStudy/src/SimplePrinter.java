interface Printable3{
	static void printLine(String str) {
		System.out.println(str);
	}
	default void print(String doc) {
		printLine(doc);
	}
}

// 인터페이스 Printable에는 구현해야 할 메소드가 존재하지 않는다.
class Printer3 implements Printable3 { }

class SimplePrinter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myDoc = "This is a report about...";
		Printable3 prn = new Printer3();
		prn.print(myDoc);
		
		// 인터페이스의 static 메소드 직접 호출
		Printable3.printLine("end of line");
	}

}
