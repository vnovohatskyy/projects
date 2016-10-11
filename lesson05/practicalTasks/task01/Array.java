package lesson05.practicalTasks.task01;

public class Array {

	public Array() {
	}

	public int maxArray(int[] arr) {
		int max = arr[0];
		int i = 0;
		while (i < arr.length) {
			if (arr[i] > max) {
				max = arr[i];
			}
			i++;
		}
		return max;
	}

	public int minArray(int[] arr) {
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

	public int sumPlus(int[] arr) {
		int amount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				amount += arr[i];
			}
		}
		return amount;
	}

	public int sumMinus(int[] arr) {
		int amount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 0) {
				amount += arr[i];
			}
		}
		return amount;
	}

	public int amountPlus(int[] arr) {
		int amount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0 && arr[i] <= maxArray(arr)) {
				amount++;
			}
		}
		return amount;
	}

	public int amountMinus(int[] arr) {
		int amount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0 && arr[i] >= minArray(arr)) {
				amount++;
			}
		}
		return amount;
	}

	public void equalsAmount(int[] arr) {
		if (amountPlus(arr) > amountMinus(arr)) {
			System.out.println(
					"The amount of positive numbers in the array is grater than amount of negative numbers in the array.");
		} else if (amountPlus(arr) == amountMinus(arr)) {
			System.out.println(
					"The amount of positive numbers in the array is equal to amount of negative numbers in the array.");
		} else {
			System.out.println(
					"The amount of positive numbers in the array is less than amount of negative numbers in the array.");
		}
	}
}
