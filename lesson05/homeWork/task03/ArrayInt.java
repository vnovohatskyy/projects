package lesson05.homeWork.task03;

public class ArrayInt {

	public ArrayInt() {
	}

	public int getArrayIndex(int[] arr, int value) {

		int k = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == value) {
				k = i;
				break;
			}
		}
		return k;
	}

	public int getPositiveIndex(int[] arr, int index) {
		int k = 0;
		int n = 0;

		while (n < index) {
			k++;
			if (arr[k - 1] > 0)
				n++;
		}

		return k - 1;

	}

	public int getMinimumNumber(int[] arr) {
		int min = arr[0];
		int i = 0;
		while (i < arr.length) {
			if (arr[i] < min) {
				min = arr[i];
			}
			i++;
		}
		return min;
	}

}
