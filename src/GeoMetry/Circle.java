package GeoMetry;

public class Circle extends Shapes{

	Coordinate middle;
	Coordinate radiusPoint;
	double radius;
	
	public Circle(Coordinate middle, Coordinate radiusPoint) {
		super();
		this.middle = middle;
		this.radiusPoint = radiusPoint;
	}
	

	public Coordinate getMiddle() {
		return middle;
	}

	public void setMiddle(Coordinate middle) {
		this.middle = middle;
	}

	public Coordinate getRadiusPoint() {
		return radiusPoint;
	}

	public void setRadiusPoint(Coordinate radiusPoint) {
		this.radiusPoint = radiusPoint;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	/*
	 * Calculation of the Radius of Circle
	 */
	public double calculateRadius(Coordinate middle, Coordinate radiusPoint) {
        double radius = Math.sqrt(Math.pow(radiusPoint.getX() - middle.getX(), 2) +
					Math.pow(radiusPoint.getY() - middle.getY(), 2));
        return radius;
    }


	/*
	 * Calculates the circumference of Circle
	 */
	
	public double calculateCircumference() {
		radius = this.calculateRadius(this.getMiddle(), this.getRadiusPoint());
		double circumference = radius *2 *Math.PI;
		return circumference;
	}
	
	
	
	
	
	
	

}
