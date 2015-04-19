package ee.varh1i.main.structural.bridge;

public class Media extends Content {

	private String filename;
	
	public Media(String filename, PlayApi api) {
		super(api);
		this.filename = filename;
	}

	@Override
	public void play() {
		playApi.play(filename);
	}
	
	
}
