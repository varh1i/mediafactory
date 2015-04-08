package ee.varh1i.main.creational.factories;



public class FactoryProducer {
	public static AbstractFactory getFactory(String choice){
		if (choice.equalsIgnoreCase("media")) {
			return new MediaFactory();
		} else if (choice.equalsIgnoreCase("type")) {
			return new TypeFactory();
		}
		return null;
	}
}
