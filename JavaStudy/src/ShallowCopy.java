class Point6 implements Cloneable {
	private int xPos;
	private int yPos;
	
	public Point6(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	public void showPosition() {
		System.out.printf("[%d, %d]", xPos,yPos);
		System.out.println();
	}
	
	public void changePos(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Rectangle2 implements Cloneable {
	private Point6 upperLeft;	// ���� ��� ��ǥ
	private Point6 lowerRight;	// ���� �ϴ� ��ǥ
	
	public Rectangle2(int x1, int y1, int x2, int y2) {
		upperLeft = new Point6(x1, y1);
		lowerRight = new Point6(x2, y2);
	}
	
	public void changePos(int x1, int y1, int x2, int y2) {
		upperLeft.changePos(x1, y2);
		lowerRight.changePos(x2, y2);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public void showPosition() {	// ���簢���� ��ǥ ���� ���
		System.out.print("���� ���: ");
		upperLeft.showPosition();
		
		System.out.print("���� �ϴ�: ");
		lowerRight.showPosition();
		System.out.println();
	}
}

class ShallowCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Rectangle2 org = new Rectangle2(1,1,9,9);
			Rectangle2 cpy;
			
			try {
				cpy = (Rectangle2)org.clone();
				org.changePos(2, 2, 7, 7);
				org.showPosition();
				cpy.showPosition();
			}
			catch(CloneNotSupportedException e) {
				e.printStackTrace();
			}
	}

}
