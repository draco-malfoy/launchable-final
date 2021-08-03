package testLaunchable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisionTest {

	static int a = 10, b = 5;


	@Test
	 void testDivision() {
		Assertions.assertEquals(2, MainDemo.division(a, b));
	}


}
