package ee.varh1i.main.creational.factories;

import ee.varh1i.main.creational.factories.type.Fun;
import ee.varh1i.main.creational.factories.type.Rock;
import ee.varh1i.main.creational.factories.type.Type;
import ee.varh1i.main.model.Media;

public class TypeFactory extends AbstractFactory {

	public Type getType(String type){
		if(type == null){
			return null;
		}
		if(type.equalsIgnoreCase("fun")){
			return new Fun();
		}
		if(type.equalsIgnoreCase("rock")){
			return new Rock();
		}
		return null;
	}

	@Override
	public Media getMedia(String media) {
		return null;
	}
	
}
