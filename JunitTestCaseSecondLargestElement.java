import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTestCaseSecondLargestElement {

	@Test
	public void testSecondLargestCase1() {
		int[] A = { 1, 2, 10, 20, 40, 32, 44, 51, 6 };
		assertEquals(44,SecondLargestElement.findSecond(A));
	}
	@Test
	public void testSecondLargestCase2() {
		int[] A = { 1, 2, 10, 20, 40, 43, 49, 51, 6 };
		assertEquals(49,SecondLargestElement.findSecond(A));
	}
}
