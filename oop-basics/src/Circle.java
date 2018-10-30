//import java.lang.Math;

public class Circle {
	public double radius;
	
	public double getArea(){
		double area;
		area=Math.PI*Math.pow(radius,2);
		return area;
	}
	
	Circle(){
		radius=1;
	}
	Circle(double radius){
		this.radius=radius;
	}
}
