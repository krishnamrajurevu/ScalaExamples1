class Vehicle2 {
	int speed = 60;

	public void show() {
		System.out.println("Vehicle speed1 ::"+speed);
	}
}

class Bike2 extends Vehicle2 {
	int speed = 100;
	
}

public class JavaExample1 {

	public static void main(String[] args) {
		Bike2 bike = new Bike2();
		bike.show();
		Vehicle2 vehicle=new Vehicle2();
		vehicle.show();

	}

}
