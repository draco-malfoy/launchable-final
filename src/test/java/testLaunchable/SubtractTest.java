package testLaunchable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubtractTest {

	static int a = 10, b = 5;

	
	@Test
	 void testSubtract() {
		Assertions.assertEquals(11, MainDemo.subtract(a, b));
	}

}
