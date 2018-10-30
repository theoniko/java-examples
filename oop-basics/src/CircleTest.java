
public class CircleTest {
	public static void main(String[] args) {
		Circle c= new Circle(1);
		System.out.println(c.getArea());
		
		Circle[] circles = new Circle[100];
		for(int i=0; i<circles.length; i++) {
			circles[i] = new Circle();
		}
	}
}
