package ee.varh1i.main.structural.facade;

public class ShapeMaker {
	
	private Shape circle;
	private Shape square;
	
	public ShapeMaker(){
		this.circle = new Circle();
		this.square = new Square();
	}
	
	public void drawCircle(){
		circle.draw();
	}
	
	public void drawSquare(){
		square.draw();
	}
}
