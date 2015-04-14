package ee.varh1i.main.creational.prototype;

import java.util.HashMap;

public class CarCache {

	private static HashMap<String, Car> cachedCars = new HashMap<String, Car>();
	
	public static Car getCar(String id){
		Car car = cachedCars.get(id);
		return (Car) car.clone();
	}
	
	
	public static void loadCache(){
		Car bmw = new BMW();
		bmw.setId("1");
		
		Car mercedes = new Mercedes();
		mercedes.setId("2");
		
		cachedCars.put(bmw.getId(), bmw);
		cachedCars.put(mercedes.getId(), mercedes);
	}
	
}
