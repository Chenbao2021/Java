package TP4;

public class Caillou {
	static public void swap(int[] array, int index1, int index2) {
		int tmp = array[index1];
		array[index1] = array[index2];
		array[index2] = tmp;
	}
	static public int indexOfMin(int[] array) {
		return Caillou.indexOfMin(array, 0, array.length);
	}
	static public int indexOfMin(int[] array, int bordMin, int bordMax) {
		if(array.length == 0) return -1;
		int index = bordMin;
		if(bordMin < 0 || bordMax > array.length) return -1;
		for(int i = bordMin;  i < bordMax; i++) {
			if(array[index] > array[i]) {
				index = i;
			}
		}
		return index;
	}
	static public void tri(int[] array) {
		for(int i = 0; i < array.length; i++) {
			Caillou.swap(array, i, indexOfMin(array, i, array.length));
		}
	}
}
