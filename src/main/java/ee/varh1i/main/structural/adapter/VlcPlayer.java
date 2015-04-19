package ee.varh1i.main.structural.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {

	public void playVlc(String filename) {
		System.out.println("Play vlc:" + filename);
	}

	public void playMp4(String filename) {
	}

}
