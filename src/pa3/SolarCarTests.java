package pa3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolarCarTests {

	@Test
	void testTeamSet(){
		SolarCar solar = new SolarCar("teamOne");
		String expected = "teamOne";
		String actual = solar.getTeam();
		assertEquals(expected, actual);
	}
	
	@Test
	void testSpeed() {
		SolarCar solar = new SolarCar("teamOne");
		int expected = 0;
		int actual = solar.getSpeed();
		assertEquals(expected, actual);
	}
	
	@Test
	void testAccelerateOne() {
		SolarCar solar = new SolarCar("teamOne");
		solar.accelerate();
		int expected = 1;
		int actual = solar.getSpeed();
		assertEquals(expected, actual);
	}
	
	@Test
	void testAccelerateTwo() {
		SolarCar solar = new SolarCar("teamOne");
		solar.accelerate();
		solar.accelerate();
		int expected = 2;
		int actual = solar.getSpeed();
		assertEquals(expected, actual);
	}

	@Test
	void tesFuelEmpty() {
		SolarCar solar = new SolarCar("teamOne");
		boolean expected = false;
		boolean actual = solar.isFuelEmpty();
		assertEquals(expected, actual);
	}
}
