package testLaunchable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Power {

	static int a = 10, b = 5;

	
	@Test
	 void testPower() {
		Assertions.assertEquals(100000, MainDemo.power(a, b));
	}

}
