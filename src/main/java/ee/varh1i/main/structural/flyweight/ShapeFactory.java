package ee.varh1i.main.structural.flyweight;

import java.util.HashMap;

public class ShapeFactory {

	private static HashMap<String, Shape> circles = new HashMap<String, Shape>();
	
	public static Circle getCircle(String color){
		Circle circle = (Circle) circles.get(color);
		if(circle == null){
			circle = new Circle(color);
			circles.put(color, circle);
		}
		return circle;
	}
}
