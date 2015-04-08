package ee.varh1i.main.model;

public abstract class Video implements Media, Item {

	public void play() {
		System.out.println("Play video.");
	}

	public Recording recording() {
		return new Camera();
	}

	public abstract float price();

}
