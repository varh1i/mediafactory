package ee.varh1i.main;

import ee.varh1i.main.structural.facade.ShapeMaker;


public class Main {

	public static void main(String[] args) {
		
		ShapeMaker shapeMaker = new ShapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawSquare();
	}

}
