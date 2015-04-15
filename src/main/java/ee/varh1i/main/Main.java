package ee.varh1i.main;

import ee.varh1i.main.creational.adapter.AudioPlayer;


public class Main {

	public static void main(String[] args) {
		
		AudioPlayer player = new AudioPlayer();
		player.play("mp3", "How bad you want it.mp3");
		player.play("mp4", "cats.mp3");
		player.play("vlc", "GameOfThronesS05E04.vlc");
		player.play("avi", "GameOfThronesS05E05.avi");
		
	}

}
