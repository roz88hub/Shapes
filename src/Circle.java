
public class Circle extends Shape {

	public int radius;
	
	@Override // This is an annotation
	
	public void calculateArea(){
		
		double area = Math.PI *(Math.pow(radius, 2));
		System.out.println(area);
	
	}
	
public void calculateCircumference(){
		
		double CircumferenceArea = Math.PI * radius *2;
		System.out.println("Total Circumference is : " +CircumferenceArea);
	
	}
	
	@Override
	public void draw(){
		System.out.println(" Draw circle circle");
	}
	
	
}
