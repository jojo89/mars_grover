import static org.junit.Assert.*;

import org.junit.Test;

public class RoverSpec {

	@Test
	public void testMove() {
		Rover rover = new Rover(1, 2, "N");
        rover.move(5,5);
        int expected = 3;
        assertEquals(expected, rover.getY());
	}

	@Test(expected=Error.class)
	public void testBoundary() {
		Rover rover = new Rover(1, 5, "N");
        rover.move(5,5);
	}
}
