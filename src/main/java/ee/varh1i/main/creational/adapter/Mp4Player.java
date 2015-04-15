package ee.varh1i.main.creational.adapter;


public class Mp4Player implements AdvancedMediaPlayer {

	public void playVlc(String filename) {
	}

	public void playMp4(String filename) {
		System.out.println("Play mp4: " + filename);
	}

}
