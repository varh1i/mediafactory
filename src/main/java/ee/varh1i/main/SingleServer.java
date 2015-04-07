package ee.varh1i.main;

public class SingleServer {

	private static SingleServer server = new SingleServer();
	
	private SingleServer(){}
	
	public static SingleServer getInstance(){
		return server;
	}
	
	public void run(){
		System.out.println("Server is running..");
	}
	
}
