package ee.varh1i.main;

import ee.varh1i.main.structural.bridge.Content;
import ee.varh1i.main.structural.bridge.Media;
import ee.varh1i.main.structural.bridge.Music;
import ee.varh1i.main.structural.bridge.Video;


public class Main {

	public static void main(String[] args) {
		
		Content video = new Media("cat.avi", new Video());
		
		Content music = new Media("wave.mp3", new Music());
		video.play();
		music.play();
		
	}

}
