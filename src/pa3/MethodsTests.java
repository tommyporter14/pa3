package pa3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MethodsTests {

	@Test
	void testRacersEmptyOne() {
		ArrayList<Racer> racers = new ArrayList<Racer>();
		racers.add(new GasCar("teamOne", 2));
		racers.add(new GasCar("teamTwo", 4));
		racers.add(new GasCar("teamThree", 0));
		
		int expected = 1;
		int actual = new ArrayList<Racer>(Methods.findRacersWithEmptyFuel(racers)).size();
		assertEquals(expected, actual);
	}

	@Test
	void testRacersEmptyAll() {
		ArrayList<Racer> racers = new ArrayList<Racer>();
		racers.add(new GasCar("teamOne", 0));
		racers.add(new GasCar("teamTwo", 0));
		racers.add(new GasCar("teamThree", 0));
		
		int expected = racers.size();
		int actual = new ArrayList<Racer>(Methods.findRacersWithEmptyFuel(racers)).size();
		assertEquals(expected, actual);
	}

	@Test
	void testRacersEmptyNone() {
		ArrayList<Racer> racers = new ArrayList<Racer>();
		racers.add(new GasCar("teamOne", 2));
		racers.add(new GasCar("teamTwo", 3));
		racers.add(new GasCar("teamThree", 5));
		
		int expected = 0;
		int actual = new ArrayList<Racer>(Methods.findRacersWithEmptyFuel(racers)).size();
		assertEquals(expected, actual);
	}
	
	@Test
	void testRacersEmptySolar() {
		ArrayList<Racer> racers = new ArrayList<Racer>();
		racers.add(new SolarCar("teamOne"));
		racers.add(new SolarCar("teamTwo"));
		racers.add(new SolarCar("teamThree"));
		
		int expected = 0;
		int actual = new ArrayList<Racer>(Methods.findRacersWithEmptyFuel(racers)).size();
		assertEquals(expected, actual);
	}

	@Test
	void testRacersEmptyMixCars() {
		ArrayList<Racer> racers = new ArrayList<Racer>();
		racers.add(new SolarCar("teamOne"));
		racers.add(new SolarCar("teamTwo"));
		racers.add(new SolarCar("teamThree"));
		racers.add(new GasCar("teamFour", 0));
		racers.add(new GasCar("teamFive", 4));
		racers.add(new GasCar("teamSix", 0));
		
		int expected = 2;
		int actual = new ArrayList<Racer>(Methods.findRacersWithEmptyFuel(racers)).size();
		assertEquals(expected, actual);
	}

	@Test
	void testRacersEmptyListEmpty() {
		ArrayList<Racer> racers = new ArrayList<Racer>();
		
		int expected = 0;
		int actual = new ArrayList<Racer>(Methods.findRacersWithEmptyFuel(racers)).size();
		assertEquals(expected, actual);
	}

	@Test
	void testAverageSpeedOne(){
		GasCar a = new GasCar("teamOne");
		GasCar b = new GasCar("teamTwo");
		GasCar c = new GasCar("teamThree");
		
		a.setSpeed(2);
		b.setSpeed(4);
		c.setSpeed(6);
		
		ArrayList<Racer> racers = new ArrayList<Racer>();
		racers.add(a);
		racers.add(b);
		racers.add(c);
		
		double expected = 4.0;
		double actual = Methods.findAverageSpeed(racers);
		assertEquals(expected, actual);
	}

	@Test
	void testAverageSpeedTwo(){
		GasCar a = new GasCar("teamOne");
		GasCar b = new GasCar("teamTwo");
		GasCar c = new GasCar("teamThree");
		SolarCar d = new SolarCar("TeamFour");
		SolarCar e = new SolarCar("TeamFive");
		SolarCar f = new SolarCar("Teamsix");
		
		a.setSpeed(2);
		b.setSpeed(4);
		c.setSpeed(6);
		d.setSpeed(2);
		e.setSpeed(6);
		f.setSpeed(4);
		
		ArrayList<Racer> racers = new ArrayList<Racer>();
		racers.add(a);
		racers.add(b);
		racers.add(c);
		racers.add(d);
		racers.add(e);
		racers.add(f);
		
		double expected = 4.00;
		double actual = Methods.findAverageSpeed(racers);
		assertEquals(expected, actual);
	}

	@Test
	void testAverageSpeedThree(){
		GasCar a = new GasCar("teamOne");
		GasCar b = new GasCar("teamTwo");
		GasCar c = new GasCar("teamThree");
		
		ArrayList<Racer> racers = new ArrayList<Racer>();
		racers.add(a);
		racers.add(b);
		racers.add(c);
		
		double expected = 0;
		double actual = Methods.findAverageSpeed(racers);
		assertEquals(expected, actual);
	}

	@Test
	void testAverageSpeedFour(){
		ArrayList<Racer> racers = new ArrayList<Racer>();
		
		double expected = 0;
		double actual = Methods.findAverageSpeed(racers);
		assertEquals(expected, actual);
	}

	@Test
	void testGetFasterRacerOne() {
		GasCar a = new GasCar("teamOne");
		GasCar b = new GasCar("teamTwo");
		a.accelerate();
		a.accelerate();
		b.accelerate();
		
		Racer expected = a;
		Racer actual = Methods.getFasterRacer(a, b);
		assertEquals(expected, actual);
	}

	@Test
	void testGetFasterRacerTwo() {
		SolarCar a = new SolarCar("teamOne");
		SolarCar b = new SolarCar("teamTwo");
		a.accelerate();
		b.accelerate();
		b.accelerate();
		
		Racer expected = b;
		Racer actual = Methods.getFasterRacer(a, b);
		assertEquals(expected, actual);
	}

	@Test
	void testGetFasterRacerThree() {
		SolarCar a = new SolarCar("teamOne");
		SolarCar b = new SolarCar("teamTwo");
		a.accelerate();
		b.accelerate();
		
		Racer expected = null;
		Racer actual = Methods.getFasterRacer(a, b);
		assertEquals(expected, actual);
	}

	@Test
	void testGetFasterRacerFour() {
		SolarCar a = new SolarCar("teamOne");
		GasCar b = new GasCar("teamTwo");
		a.accelerate();
		b.accelerate();
		
		Racer expected = b;
		Racer actual = Methods.getFasterRacer(a, b);
		assertEquals(expected, actual);
	}
}
