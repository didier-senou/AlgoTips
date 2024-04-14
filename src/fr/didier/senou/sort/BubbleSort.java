package fr.didier.senou.sort;

public class BubbleSort {

	public static void sort(int[] array) {
		int arrayLength = array.length;
		for (int i = 0; i < arrayLength - 1; i++) {
			for (int j = 0; j < arrayLength - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
	}
}
