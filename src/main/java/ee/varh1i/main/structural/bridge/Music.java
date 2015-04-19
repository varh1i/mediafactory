package ee.varh1i.main.structural.bridge;

public class Music implements PlayApi {

	public void play(String filename) {
		System.out.println("Play music:" + filename);
	}

}
