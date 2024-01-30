package geoMetry;
 
import java.util.ArrayList;

import java.util.HashSet;

import java.util.Set;
 
 
	 public class Group {

	    private ArrayList<Shape> shape = new ArrayList<>();
 
	    public void addShape(Shape shape) {

	        shape.add(shape);

		    public void removeShape(Shape shape) {

		        shape.remove(shape);

		    }
	 
		    public double totalArea() {

		        double totalArea = 0;

		        Set<Shape> seenShapes = new HashSet<>();

				return totalArea;
	 
		

		    }


		public double calculateTotalArea() {

	        double totalArea = 0;

	        Set<Shape> seenShape = new HashSet<>();

	        for (Shape shape : seenShape) {

	            if (!seenShape.contains(shape)) {

	                totalArea += shape.calculateArea();

	                seenShape.add(shape);

	            }

	        }

	        return totalArea;

	    }

		public double calculateTotalPerimeter() {

	        double totalPerimeter = 0;

	        Set<Shape> seenShape = new HashSet<>();
	 
	        for (Shape shape : shape) {

	            if (!seenShape.contains(shape)) {

	                totalPerimeter += shape.calculateArea();

	                seenShape.add(shape);

	            }

	        }
	 
	        return totalPerimeter;

	    }

		public Shape largestShape(){

			double maxArea = 0.0;

			for (Shape shape : shapes) {

	            double area = shape.calculateArea();

	            if( area >= maxArea ) {

	            	maxArea = area;

	            }

	        } 

	}
	 
	 
	    }
 