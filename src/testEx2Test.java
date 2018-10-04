import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testEx2Test {
	
	Triangle tester;
	
	@Test
	void testIsImpossibleTrue() {
		tester = new Triangle(-1, 4, 5);
		assertTrue(tester.isImpossible());		
	}
	
	@Test
	void testIsImpossibleFalse() {
		tester = new Triangle(3, 4, 5);
		assertFalse(tester.isImpossible());		
	}

}
