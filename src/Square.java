
public class Square extends Shape {
	
	int length;
	
	
	@Override
	public void calculateArea(){
		
		double sqArea = Math.pow(length, 2);
		System.out.println("Area of square is : " +  sqArea );
	}
	
	
}
