package ee.varh1i.main.creational.factories;

import ee.varh1i.main.creational.factories.type.Type;
import ee.varh1i.main.model.Media;

public abstract class AbstractFactory {
	public abstract Type getType(String type);
	public abstract Media getMedia(String media);
}
