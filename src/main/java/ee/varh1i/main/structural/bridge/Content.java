package ee.varh1i.main.structural.bridge;

public abstract class Content {

	protected PlayApi playApi;
	
	protected Content(PlayApi api){
		this.playApi = api;
	}
	
	public abstract void play();
}
