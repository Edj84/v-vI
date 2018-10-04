import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testEx1 {
	
	static Ex1 tester;
	int score;
	String result;
	
	@Test
	void testLowScore() {
		score = 20;
		result = "fail";
		assertEquals(tester.input(score), result);
	}
	
	@Test
	void testMidScore() {
		score = 60;
		result = "pass";
		assertEquals(tester.input(score), result);
	}

	@Test
	void testHighScore() {
		score = 90;
		result = "pass with distinction";
		assertEquals(tester.input(score), result);
	}
}
