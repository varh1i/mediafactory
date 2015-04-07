package ee.varh1i.main;

import ee.varh1i.main.model.Media;
import ee.varh1i.main.type.Type;

public abstract class AbstractFactory {
	public abstract Type getType(String type);
	public abstract Media getMedia(String media);
}
