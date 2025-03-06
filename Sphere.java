// Sphere.java

import java.lang.*;
class Sphere extends Shape{
	public Sphere(double radius){
		super(radius,0,0,4);	
	}
	
	public double calculateArea(){
		return 4 * 3.14 * (dim_one * dim_one);
	}
	
	public double calculatePerimeter(){ // Same as Circle
		return 2 * 3.14 *(dim_one);
	}
	
	public double calculateVolume(){
		return (4.0 / 3.0)* 3.14 * ((dim_one) * (dim_one) *(dim_one));
	}
}