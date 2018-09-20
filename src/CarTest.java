
public class CarTest {

	public static void main( String [ ] args ) {
		Car car1 = new Car( 2001, "Jetta");
			
		System.out.println( "Accelerating...");
		for( int seconds = 1; seconds <= 10; seconds++ ) {
			car1.accelerate();
			System.out.println( "Current speed of the " + car1.getModel() + " " + car1.getMake() + " is " + car1.getSpeed() + " mph "); 
		}
		
		System.out.println( "\nBraking...");
		for( int seconds = 1; seconds <= 10; seconds++ ) {
			car1.brake();
			System.out.println( "Current speed pf the " + car1.getModel() + " " + car1.getMake() + " is " + car1.getSpeed() + " mph " );
			
		
		
		}
	}
	
	
	
	
	
	
	
	
	
}
