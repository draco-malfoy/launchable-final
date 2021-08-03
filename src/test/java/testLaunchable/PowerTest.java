package testLaunchable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PowerTest {

	static int a = 10, b = 5;

	
	@Test
	 void testPower() {
		Assertions.assertEquals(10000, MainDemo.power(a, b));
	}

}
