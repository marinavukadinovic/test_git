package GeoMetry;

public class Rectangle extends Shapes{
	
    Coordinate point1;
    Coordinate point2;
 

    public Rectangle(Coordinate point1, Coordinate point2) {
    	super();
        this.point1 = point1;
        this.point2 = point2;
    }

    
    /*
     * Calculation of circumference of Rectangle
     */

	public double calculateCircumference() {
		double length = Math.abs(point2.getX() - point1.getX());
		double width = Math.abs(point2.getY() - point1.getY());
		double circumference = 2 *length + 2*width;
		return circumference;
	}
    
    
    
    
}