//Main.java

import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		// Triangle
		System.out.println("Enter base of Traingle: ");
		double base = Double.parseDouble(scan.nextLine());
		
		System.out.println("Enter height of Traingle: ");
		double height = Double.parseDouble(scan.nextLine());
		System.out.println("___________________________________________");
		Shape traingle = new Triangle(base, height);
		
		System.out.println("Area of Triangle is: "+ traingle.calculateArea());
		System.out.println("Perimeter of Triangle is: "+ traingle.calculatePerimeter());
		System.out.println("___________________________________________");		
		
		// Rectangle
		System.out.println("Enter length of Rectangle: ");
		double length = Double.parseDouble(scan.nextLine());
		
		System.out.println("Enter breadth of Rectangle: ");
		double breadth = Double.parseDouble(scan.nextLine());
		
		System.out.println("___________________________________________");	
		Shape rectangle = new Rectangle(length, breadth);
		
		System.out.println("Area of Rectangle is: "+ rectangle.calculateArea());
		System.out.println("Perimeter of Rectangle is: "+ rectangle.calculatePerimeter());
		System.out.println("___________________________________________");	

		// Cube
        System.out.println("Enter side of Cube: ");
		double side = Double.parseDouble(scan.nextLine());
	    System.out.println("___________________________________________");	
		Shape cube = new Cube(side);
		
		System.out.println("Total Surface Area of Cube is: "+ cube.calculateArea());
		System.out.println("Perimeter of Cube is: "+ cube.calculatePerimeter());
		System.out.println("Volume of Cube is: "+ cube.calculateVolume());
		System.out.println("___________________________________________");		
		
        // Square
		System.out.println("Enter side of Square: ");
		double side2 = Double.parseDouble(scan.nextLine());
		
		System.out.println("___________________________________________");	
		Shape square = new Square(side2);
		
		System.out.println("Area of Square is: "+ square.calculateArea());
		System.out.println("Perimeter of Square is: "+ square.calculatePerimeter());
		System.out.println("___________________________________________");		
        
		// Circle
		System.out.println("Enter radius of circle: ");
		double radius = Double.parseDouble(scan.nextLine());
		
		System.out.println("___________________________________________");	
		Shape circle = new Circle(radius);
		
		System.out.println("Area of Square is: "+ circle.calculateArea());
		System.out.println("Perimeter of Square is: "+ circle.calculatePerimeter());
		System.out.println("___________________________________________");		
		
		// Sphere
		System.out.println("Enter radius of Sphere: ");
		double radius2 = Double.parseDouble(scan.nextLine());
	    System.out.println("___________________________________________");	
		Shape sphere = new Sphere(radius2);
		
		System.out.println("Total Surface Area of Cube is: "+ sphere.calculateArea());
		System.out.println("Perimeter of Cube is: "+ sphere.calculatePerimeter());
		System.out.println("Volume of Cube is: "+ sphere.calculateVolume());
		System.out.println("___________________________________________");		
		

		
	}
	
}