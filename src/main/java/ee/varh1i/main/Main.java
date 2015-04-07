package ee.varh1i.main;

import ee.varh1i.main.model.Media;

public class Main {

	public static void main(String[] args) {
		MediaFactory mediaFactory = new MediaFactory();
		Media media1 = mediaFactory.getMedia("music");
		media1.play();
		Media media2 = mediaFactory.getMedia("video");
		media2.play();

	}

}
