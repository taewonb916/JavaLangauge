class MobilePhone {
	protected String number;	// 전화번호
	
	public MobilePhone(String num) {
		number = num;
	}
	public void answer() {
		System.out.println("Hi~ from " + number);
	}
}	

class SmartPhone extends MobilePhone {
	private String androidVer;	// 안드로이드 운영체제 네임
	
	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;
	}
	public void playApp() {
		System.out.println("App is running in " + androidVer);
	}
}
class MobileSmartPhone {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone phone = new SmartPhone("010-2222-1111", "Nougat");
		phone.answer();
		phone.playApp();
	}

}
