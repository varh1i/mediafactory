package ee.varh1i.main.creational.prototype;

public class Mercedes extends Car {

	public Mercedes(){
		this.type = "Mercedes";
	}
	
	@Override
	public void drive() {
		System.out.println("Driving a Mercedes");
	}

}
