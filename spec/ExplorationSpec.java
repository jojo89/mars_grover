import static org.junit.Assert.*;

import org.junit.Test;

public class ExplorationSpec {

	@Test
	public void testFinalPosition() {
		Map map = new Map(5,5);
		Exploration exploration = new Exploration(map);
		Rover rover = new Rover(1,2,"N");
		exploration.setRover(rover);
		exploration.setRoute("LMLMLMLMM");
		exploration.cartegraph();
	    String expectation = "1 3 N";
	    assertEquals(expectation, exploration.finalPosition());
	}
}
