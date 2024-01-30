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
	
	