package testLaunchable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumTest {

	static int a = 10, b = 5;

	@Test
	 void testAdd() {
		Assertions.assertEquals(15, MainDemo.sum(a, b));
	}


}
