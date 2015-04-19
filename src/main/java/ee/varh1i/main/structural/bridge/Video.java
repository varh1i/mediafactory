package ee.varh1i.main.structural.bridge;

public class Video implements PlayApi {

	public void play(String filename) {
		System.out.println("Play video: " + filename);
	}

}
