package testLaunchable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Multiplication {

	static int a = 10, b = 5;

	@Test
	 void testMultiplication() {
		Assertions.assertEquals(5, MainDemo.multiplication(a, b));
	}


}
