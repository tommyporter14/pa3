package pa3;

public class GasCar extends Racer{

	//fields
	int fuel;

	//getters/setters
	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}
	
	//constructors
	public GasCar(String team, int fuel) {
		super(team, 0);
		setFuel(fuel);
	}
	
	public GasCar(String team) {
		super(team, 0);
		setFuel(10);
	}
	
	//methods
	@Override
	public void accelerate() {
		setSpeed(speed +2);
		setFuel(fuel -1);
	}
	
	@Override
	public boolean isFuelEmpty() {
		if (fuel <= 0) {
			return true;
		} else {
			return false;
		}
	}
}
