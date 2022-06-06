package pa3;

public class SolarCar extends Racer {

	//fields
	//none
	
	//constructor
	public SolarCar(String team) {
	super(team, 0);
	}
	
	@Override
	public void accelerate() {
		setSpeed(speed +1);
	}
	
	@Override
	public boolean isFuelEmpty() {
		return false;
	}
}
