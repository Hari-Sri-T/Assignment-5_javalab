//Main.java

import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter base of Traingle: ");
		double base = Double.parseDouble(scan.nextLine());
		
		System.out.println("Enter height of Traingle: ");
		double height = Double.parseDouble(scan.nextLine());
		System.out.println("___________________________________________");
		Shape traingle = new Triangle(base, height);
		
		System.out.println("Area of Triangle is: "+ traingle.calculateArea());
		System.out.println("Perimeter of Triangle is: "+ traingle.calculatePerimeter());
		System.out.println("___________________________________________");		
		
		System.out.println("Enter length of Rectangle: ");
		double length = Double.parseDouble(scan.nextLine());
		
		System.out.println("Enter breadth of Rectangle: ");
		double breadth = Double.parseDouble(scan.nextLine());
		
		System.out.println("___________________________________________");	
		Shape rectangle = new Rectangle(length, breadth);
		
		System.out.println("Area of Triangle is: "+ rectangle.calculateArea());
		System.out.println("Perimeter of Triangle is: "+ rectangle.calculatePerimeter());
		System.out.println("___________________________________________");		
	}
	
}