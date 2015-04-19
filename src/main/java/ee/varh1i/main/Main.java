package ee.varh1i.main;

import ee.varh1i.main.structural.decorator.Circle;
import ee.varh1i.main.structural.decorator.Rectangle;
import ee.varh1i.main.structural.decorator.RedShapeDecorator;
import ee.varh1i.main.structural.decorator.Shape;


public class Main {

	public static void main(String[] args) {
		
		Shape circle = new Circle();

	    Shape redCircle = new RedShapeDecorator(new Circle());

	    Shape redRectangle = new RedShapeDecorator(new Rectangle());
	    System.out.println("Circle with normal border");
	    circle.draw();

	    System.out.println("\nCircle of red border");
	    redCircle.draw();

	    System.out.println("\nRectangle of red border");
	    redRectangle.draw();	    
	}

}
