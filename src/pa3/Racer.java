package pa3;

public abstract class Racer {

	//fields
	String team;
	int speed;
	
	//getters/setters
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	//constructor
	public Racer(String team, int speed) {
		this.team = team;
		this.speed = speed;
	}
	
	//methods
	public abstract void accelerate();
	
	public abstract boolean isFuelEmpty();
}
