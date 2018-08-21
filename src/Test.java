public class Test {
	
	public static void main(String[] args){
		
		Shape s = new Shape();
		Circle c = new Circle();
		c.radius = 8;
		s.calculateArea();
		c.calculateArea();
		c.calculateCircumference();
		c.draw();
		
		
		Square sq = new Square();
		sq.length = 6;
		sq.calculateArea();
		
		
		Triangle tr = new Triangle();
		tr.length = 6;
		tr.heigth = 4;
		tr.calculateArea();
		
	}
	
		
}
