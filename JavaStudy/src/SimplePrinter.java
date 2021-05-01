interface Printable3{
	static void printLine(String str) {
		System.out.println(str);
	}
	default void print(String doc) {
		printLine(doc);
	}
}

// �������̽� Printable���� �����ؾ� �� �޼ҵ尡 �������� �ʴ´�.
class Printer3 implements Printable3 { }

class SimplePrinter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myDoc = "This is a report about...";
		Printable3 prn = new Printer3();
		prn.print(myDoc);
		
		// �������̽��� static �޼ҵ� ���� ȣ��
		Printable3.printLine("end of line");
	}

}
