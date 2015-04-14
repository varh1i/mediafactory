package ee.varh1i.main;

import ee.varh1i.main.creational.prototype.Car;
import ee.varh1i.main.creational.prototype.CarCache;


public class Main {

	public static void main(String[] args) {
		
		CarCache.loadCache();
		
		Car bmw = CarCache.getCar("1");
		System.out.println("Car type: " + bmw.getType());
		
		bmw.setId("3");
		bmw = CarCache.getCar("1");
		System.out.println("Car type: " + bmw.getType());
		
	}

}
