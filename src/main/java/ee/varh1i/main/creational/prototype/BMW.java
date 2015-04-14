package ee.varh1i.main.creational.prototype;

public class BMW extends Car {

	public BMW(){
		this.type = "BMW";
	}
	
	@Override
	public void drive() {
		System.out.println("Driving a BMW");
	}

}
