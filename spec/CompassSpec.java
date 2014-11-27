import static org.junit.Assert.*;

import org.junit.Test;

public class CompassSpec {

	@Test
	public void testDirectionIndex() {
		Compass compass = new Compass("N");
		int expectation = 0;
		int index = compass.directionIndex();
		assertEquals(index, expectation);
	}
	@Test
	public void testTurnLeft() {
		Compass compass = new Compass("N");
		String expectation = "W";
		compass.turnLeft();
		String direction = compass.getDirection();
		assertEquals(direction, expectation);
	}
	@Test
	public void testTurnRight() {
		Compass compass = new Compass("N");
		String expectation = "E";
		compass.turnRight();
		String direction = compass.getDirection();
		assertEquals(direction, expectation);
	}

}
