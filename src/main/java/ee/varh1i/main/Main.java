package ee.varh1i.main;

import ee.varh1i.main.structural.flyweight.Circle;
import ee.varh1i.main.structural.flyweight.ShapeFactory;



public class Main {

	private static String[] colors = {"red","green", "blue"};
	
	public static void main(String[] args) {
		
		for(int i=0; i<10; i++){
			Circle circle = ShapeFactory.getCircle(getRandomColor());
			circle.setRadius(getRandomValue());
			circle.setX(getRandomValue());
			circle.setY(getRandomValue());
			circle.draw();
		}
	}
	
	public static String getRandomColor(){
		return colors[(int)(Math.random()*colors.length)];
	}

	public static int getRandomValue(){
		return (int)(Math.random()*100);
	}
}
