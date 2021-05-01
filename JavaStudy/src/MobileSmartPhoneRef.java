class MobilePhone1 {
	protected String number;
	
	public MobilePhone1(String num) {
		number = num;
	}
	public void answer() {
		System.out.println("Hi~ from " + number);
	}
}
class SmartPhone1 extends MobilePhone1 {
	private String androidver;
	
	public SmartPhone1(String num, String ver) {
		super(num);
		androidver = ver;
	}
	public void playApp() {
		System.out.println("App is running in " + androidver);
	}
}

class MobileSmartPhoneRef {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone1 ph1 = new SmartPhone1("010-1111-2222", "Nougat");
		MobilePhone1 ph2 = new SmartPhone1("010-2222-3333", "Nougat");
		
		ph1.answer();
		ph1.playApp();
		System.out.println();
		
		ph2.answer();
		//ph2.playApp(); 스마트폰에 있는 건 참조 불가능
		
	}

}
