package ee.varh1i.main;

import ee.varh1i.main.model.Media;
import ee.varh1i.main.model.Music;
import ee.varh1i.main.model.Video;

public class MediaFactory {

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
	
}
