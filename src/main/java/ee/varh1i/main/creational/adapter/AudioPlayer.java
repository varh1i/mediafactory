package ee.varh1i.main.creational.adapter;

public class AudioPlayer implements MediaPlayer {

	public void play(String audioType, String filename) {
		if(audioType.equalsIgnoreCase("mp3")){
			System.out.println("Play mp3: " + filename);
		} else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4") ) {
			MediaAdapter adapter = new MediaAdapter(audioType);
			adapter.play(audioType, filename);
		} else {
			System.out.println("Audiotype: " + audioType + " is not supported");
		}

	}

}
