package ee.varh1i.main.creational.factories;

import ee.varh1i.main.model.FunnyVideo;
import ee.varh1i.main.model.Media;
import ee.varh1i.main.model.PopMusic;
import ee.varh1i.main.type.Type;

public class MediaFactory extends AbstractFactory {

	public Media getMedia(String mediaType){
		if(mediaType == null){
			return null;
		}
		if(mediaType.equalsIgnoreCase("music")){
			return new PopMusic();
		}
		if(mediaType.equalsIgnoreCase("video")){
			return new FunnyVideo();
		}
		return null;
	}

	@Override
	public Type getType(String type) {
		return null;
	}
	
}
