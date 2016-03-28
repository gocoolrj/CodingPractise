import static org.junit.Assert.*;

import org.junit.Test;

public class JunitKthElementFind {

	@Test
	public void testSmall() {
		int[] A = { 1, 2, 10, 20, 40, 32, 44, 51, 6 };
		int k = 4;
		assertEquals(10,KthElementFind.findKthSmallest(A,k));
		
	}
	@Test
	public void testLargest() {
		int[] A = { 1, 2, 10, 20, 40, 32, 44, 51, 6 };
		int k = 4;
		assertEquals(32,KthElementFind.findKthSmallest(A,k));
		
	}

}
