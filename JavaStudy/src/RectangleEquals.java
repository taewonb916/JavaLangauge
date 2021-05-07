class Point {
	private int xPos;
	private int yPos;
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(xPos == ((Point)obj).xPos && yPos == ((Point)obj).yPos)
			return true;
		else
			return false;
	}
}

class Rectangle {
	private Point upperLeft;
	private Point lowerRight;
	public Rectangle(int x1, int x2, int y1, int y2) {
		upperLeft = new Point(x1, y1);
		lowerRight = new Point(x2, y2);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(upperLeft.equals(((Rectangle)obj).upperLeft) && lowerRight.equals(((Rectangle)obj).lowerRight))
			return true;
		else
			return false;		
	}
}

class RectangleEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p1 = new Point(1,2);
		Point p2 = new Point(1,2);
		Point p3 = new Point(1,3);
		
		Rectangle r1 = new Rectangle(1,2,3,4);
		Rectangle r2 = new Rectangle(1,2,3,4);
		Rectangle r3 = new Rectangle(1,2,3,5);
		
		if(p1.equals(p2))
			System.out.println("p1과 p2의 내용 동일");
		else
			System.out.println("p1과 p2 내용 다름");
		
		if(p1.equals(p3))
			System.out.println("p1과 p3의 내용 동일");
		else
			System.out.println("p1과 p3 내용 다름");
		
		
		
		if(r1.equals(r2))
			System.out.println("r1과 r2의 내용 동일");
		else
			System.out.println("r1과 r2 내용 다름");
		
		if(r1.equals(r3))
			System.out.println("r1과 r3의 내용 동일");
		else
			System.out.println("r1과 r3 내용 다름");
			
		
	}

}
