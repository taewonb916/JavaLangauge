class Car {	// �⺻ ���� �ڵ���
	int gasolineGauge;	// ���ָ� �ܿ���	
	public Car(int gasolinGauge) {
		this.gasolineGauge = gasolinGauge;
	}
}

class HybridCar extends Car {	// ���̺긮�� �ڵ���
	int electricGauge;	// ���� ���͸� �ܿ���
	public HybridCar(int gasolinGauge, int electricGauge) {
		super(gasolinGauge);
		this.electricGauge = electricGauge;
	}
}

class HybridWaterCar extends HybridCar {	// ���̺긮�� ����ī
	int waterGauge;	// ������ ��ȯ�� ���� �ܿ���
	public HybridWaterCar(int gasolinGauge, int electricGauge, int waterGauge) {
		super(gasolinGauge, electricGauge);
		this.waterGauge = waterGauge;
	}
	public void showCurrentGauge() {
		System.out.println("�ܿ� ���ָ�: " + gasolineGauge);
		System.out.println("�ܿ� ���ⷮ: " + electricGauge);
		System.out.println("�ܿ� ���ͷ�: " + waterGauge);
	}
}
public class ConstructorAndSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HybridWaterCar hwc = new HybridWaterCar(300, 200, 100);
		hwc.showCurrentGauge();

	}

}
