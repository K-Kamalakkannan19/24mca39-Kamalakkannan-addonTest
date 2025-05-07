class Rectangle {
	int length, breadth;

	public Rectangle() {
		length = breadth = 0;
	}

	public Rectangle(int l, int b) {
		length = l;
		breadth = b;
	}

	public void display() {
		System.out.println("Rectangle length,breadth: " + length + "," + breadth);
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(10, 5);
		rect1.display();
		rect2.display();
	}
}
