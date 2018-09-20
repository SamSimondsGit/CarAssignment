
public class Car {
	
	public int model;
	public String make;
	public int speed;
	
	public int getModel() {
		return model;
	}
	
	public String getMake() {
		return make;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void accelerate() {
		speed += 10;
	}
	
	public void brake() {
		speed-= 10;
	}
	
	public Car( int modelGiven, String makeGiven ) {
		model = modelGiven;
		make = makeGiven;
		speed = 0;
	}
	
	
	

}
