package pa3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GasCarTests {

	@Test
	void testTeamOne() {
		GasCar gas = new GasCar("teamTwo", 15);
		String expected = "teamTwo";
		String actual = gas.getTeam();
		assertEquals(expected, actual);
	}

	@Test
	void testFuelOne() {
		GasCar gas = new GasCar("teamTwo", 15);
		int expected = 15;
		int actual = gas.getFuel();
		assertEquals(expected, actual);
	}

	@Test
	void testFuelTwo() {
		GasCar gas = new GasCar("teamTwo");
		int expected = 10;
		int actual = gas.getFuel();
		assertEquals(expected, actual);
	}

	@Test
	void testAccelerateOne() {
		GasCar gas = new GasCar("teamTwo");
		gas.accelerate();
		int expected = 2;
		int actual = gas.getSpeed();
		assertEquals(expected, actual);
	}

	@Test
	void testAccelerateFuelOne() {
		GasCar gas = new GasCar("teamTwo");
		gas.accelerate();
		int expected = 9;
		int actual = gas.getFuel();
		assertEquals(expected, actual);
	}

	@Test
	void testAccelerateTwo() {
		GasCar gas = new GasCar("teamTwo");
		gas.accelerate();
		gas.accelerate();
		int expected = 4;
		int actual = gas.getSpeed();
		assertEquals(expected, actual);
	}

	@Test
	void testAccelerateFuelTwo() {
		GasCar gas = new GasCar("teamTwo");
		gas.accelerate();
		gas.accelerate();
		int expected = 8;
		int actual = gas.getFuel();
		assertEquals(expected, actual);
	}

	@Test
	void testFuelEmptyOne() {
		GasCar gas = new GasCar("teamTwo",0);
		boolean expected = true;
		boolean actual = gas.isFuelEmpty();
		assertEquals(expected, actual);
	}
	
	@Test
	void testFuelEmptyTwo() {
		GasCar gas = new GasCar("teamTwo",2);
		boolean expected = false;
		boolean actual = gas.isFuelEmpty();
		assertEquals(expected, actual);
	}
}
