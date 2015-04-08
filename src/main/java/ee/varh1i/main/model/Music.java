package ee.varh1i.main.model;

public abstract class Music implements Media, Item {

	public void play() {
		System.out.println("Play music");
		
	}

	public Recording recording() {
		return new Microfon();
	}

	public abstract float price();

}
