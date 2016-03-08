package base;
public class Triangle extends GeometricObject {
/**
 * Three double data fields
 */
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

/**
 * Creates an equilateral triangle with all the sides equal to 1.
 */
	public Triangle() {
	}

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	/**
	 * This gets all 3 sides of the triangle.
	 * 
	 */
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	/**
	 * Adds the sides to get the perimater
	 */
    public double getPerimeter() 
    
    {
    	double perimeter = side1 + side2 + side3;
        return perimeter;
    }
    /**
	 * Calculates the area of the triangle
	 */   
    public double getArea() 
    
	{
    	double side1 = getSide1();
    	double side2 = getSide2();
    	double side3 = getSide3();
    	double halfOfPer = getPerimeter()/2;
		double area = Math.sqrt(halfOfPer*(halfOfPer -side1)*(halfOfPer-side2)*(halfOfPer-side3));
        return area;
    }
    /**
	 * Finally, an output message to give the user the info.
	 */
    public String toString() 
    {
    	return " The area of the triangle is: " + getArea() + "\n " +"The perimeter of this triangle is: " + getPerimeter() +
    		"/n" + "These are calculated using side 1: " + side1 + ", side 2: " + side2 + ", and side 3: " + side3;
    }
}