package ee.varh1i.main.factories;

import ee.varh1i.main.model.Media;
import ee.varh1i.main.model.Music;
import ee.varh1i.main.model.Video;
import ee.varh1i.main.type.Type;

public class MediaFactory extends AbstractFactory {

	public Media getMedia(String mediaType){
		if(mediaType == null){
			return null;
		}
		if(mediaType.equalsIgnoreCase("music")){
			return new Music();
		}
		if(mediaType.equalsIgnoreCase("video")){
			return new Video();
		}
		return null;
	}

	@Override
	public Type getType(String type) {
		return null;
	}
	
}
