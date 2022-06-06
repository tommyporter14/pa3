package pa3;

import java.util.ArrayList;

public class Methods {

	public static ArrayList<Racer> findRacersWithEmptyFuel(ArrayList<Racer> racers){
		ArrayList<Racer> racer = new ArrayList<Racer>();
		for(int i = 0; i < racers.size(); i++) {
			if(racers.get(i).isFuelEmpty() == true) {
				racer.add(racers.get(i));
			}
			
		}
		return racer;
	}

	public static double findAverageSpeed (ArrayList<Racer> racers) {
		int sum = 0;
		double avg = 0;
		if (racers.size() > 0) {
			for(int i = 0; i < racers.size(); i++) {
				sum = sum + racers.get(i).getSpeed();
			}
			avg = (double) sum / racers.size();
		}
		return avg;
	}

	public static Racer getFasterRacer(Racer racerA, Racer racerB) {
		Racer Racer;
		if( racerA.getSpeed() > racerB.getSpeed()) {
			Racer = racerA;
		} else if (racerB.getSpeed() > racerA.getSpeed()) {
			Racer = racerB;
		} else {
			Racer = null;
		}
		return Racer;
	}
}
