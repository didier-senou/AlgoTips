package fr.didier.senou.sort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SortTest {
	@Test
	public void testBubbleSort() {
		int[] initialArray = { 2, 1, 8, 7, 4 };
		int[] expectedArray = { 1, 2, 4, 7, 8 };
		BubbleSort.sort(initialArray);

		assertArrayEquals(initialArray, expectedArray);
	}
}
