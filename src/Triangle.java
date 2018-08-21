
public class Triangle extends Shape{
  int length;
  int width;
  int heigth;
  
  
  @Override
  public void calculateArea() {
	  
	  double areaTriangle = (length * heigth)/ 2;
	  System.out.println("Area of triangle is : " +  areaTriangle );
	  
  }
	
}
