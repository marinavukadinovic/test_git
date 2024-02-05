package GeoMetry;
 
import java.util.ArrayList;
 
public abstract class Shape {
	private ArrayList<Shape> shape;
	double circumference;
	double area;
	double addedArea;
	public abstract double calculateCircumference();
	public abstract double calculateArea();
	public ArrayList<Shape> getShape() {
		return shape;
	}

	public void setShape (ArrayList<Shape> shape) {
		this.shape = shape;
	}
	public double getCircumference() {
		return circumference;
	}
	public void setCircumference(double circumference) {
		this.circumference = circumference;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
 
}
	