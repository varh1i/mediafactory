package ee.varh1i.main.structural.decorator;

public class RedShapeDecorator implements Shape {

	private Shape decoratedShape;
	
	public RedShapeDecorator(Shape shape){
		decoratedShape = shape;
	}
	
	public void draw() {
		decoratedShape.draw();
		setRedBorder();
	}

	private void setRedBorder(){
		System.out.println("Set border red!");
	} 
	
}
