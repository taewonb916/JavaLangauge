interface Printable1 {
	public void print(String doc);
}

class SPrinterDriver implements Printable1 {
	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
}

class LPrinterDriver implements Printable1 {
	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}
}
class PrinterDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myDoc = "This is a report about...";
		
		// 삼성 프린터로 출력
		Printable1 prn = new SPrinterDriver();
		prn.print(myDoc);
		System.out.println();
		
		// 엘지 프린터로 출력
		prn = new LPrinterDriver();
		prn.print(myDoc);
	}
}
