package ee.varh1i.main.creational.adapter;

public class MediaAdapter implements MediaPlayer {

	private AdvancedMediaPlayer mediaPlayer;

	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("vlc")) {
			mediaPlayer = new VlcPlayer();
		} else if (audioType.equalsIgnoreCase("mp4")) {
			mediaPlayer = new Mp4Player();
		}
	}

	public void play(String audioType, String filename) {
		if (audioType.equalsIgnoreCase("vlc")) {
			mediaPlayer.playVlc(filename);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			mediaPlayer.playMp4(filename);
		}
	}

}
