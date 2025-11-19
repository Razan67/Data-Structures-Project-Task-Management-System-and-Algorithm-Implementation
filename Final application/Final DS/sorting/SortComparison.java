package sorting;


	
	import java.util.Arrays;
	import java.util.Random;

	public class SortComparison {

	    public static void main(String[] args) {
	        int[] sizes = {100000, 1000000};
	        String[] types = {"sorted", "random", "reversed"};

	        for (int size : sizes) {
	            int[] sortedArray = generateSortedArray(size);
	            int[] randomArray = generateRandomArray(size);
	            int[] reversedArray = generateReversedArray(size);

	            System.out.println("\nArray size: " + size);

	            for (String type : types) {
	                int[] array = null;
	                switch (type) {
	                    case "sorted":
	                        array = Arrays.copyOf(sortedArray, sortedArray.length);
	                        break;
	                    case "random":
	                        array = Arrays.copyOf(randomArray, randomArray.length);
	                        break;
	                    case "reversed":
	                        array = Arrays.copyOf(reversedArray, reversedArray.length);
	                        break;
	                }

	                // Timing Merge Sort
	                int[] mergeSortArray = Arrays.copyOf(array, array.length);
	                long start = System.currentTimeMillis();
	                mergeSort(mergeSortArray);
	                long finish = System.currentTimeMillis();
	                long mergeSortTime = finish - start; // Time in milliseconds

	                // Timing Enhanced Selection Sort
	                int[] enhancedSelectionSortArray = Arrays.copyOf(array, array.length);
	                start = System.currentTimeMillis();
	                enhancedSelectionSort(enhancedSelectionSortArray);
	                finish = System.currentTimeMillis();
	                long enhancedSelectionSortTime = finish - start; // Time in milliseconds

	                System.out.println("  " + type.substring(0, 1).toUpperCase() + type.substring(1) + " array:");
	                System.out.println("    Merge Sort: " + mergeSortTime + " ms");
	                System.out.println("    Enhanced Selection Sort: " + enhancedSelectionSortTime + " ms");
	            }
	        }
	    }

	    // Merge Sort implementation
	    public static void mergeSort(int[] array) {
	        if (array.length > 1) {
	            int mid = array.length / 2;
	            int[] left = Arrays.copyOfRange(array, 0, mid);
	            int[] right = Arrays.copyOfRange(array, mid, array.length);

	            mergeSort(left);
	            mergeSort(right);

	            merge(array, left, right);
	        }
	    }

	    public static void merge(int[] result, int[] left, int[] right) {
	        int i = 0, j = 0, k = 0;

	        while (i < left.length && j < right.length) {
	            if (left[i] <= right[j]) {
	                result[k++] = left[i++];
	            } else {
	                result[k++] = right[j++];
	            }
	        }

	        while (i < left.length) {
	            result[k++] = left[i++];
	        }

	        while (j < right.length) {
	            result[k++] = right[j++];
	        }
	    }

	    // Enhanced Selection Sort implementation
	    public static void enhancedSelectionSort(int[] array) {
	        int left = 0;
	        int right = array.length - 1;

	        while (left < right) {
	            int minIdx = left;
	            int maxIdx = right;

	            for (int i = left; i <= right; i++) {
	                if (array[i] < array[minIdx]) {
	                    minIdx = i;
	                }
	                if (array[i] > array[maxIdx]) {
	                    maxIdx = i;
	                }
	            }

	            swap(array, left, minIdx);

	            if (array[minIdx] == array[maxIdx]) {
	                swap(array, right, minIdx);
	            } else {
	                swap(array, right, maxIdx);
	            }

	            left++;
	            right--;
	        }
	    }

	    public static void swap(int[] array, int i, int j) {
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }

	    // Helper functions to generate arrays
	    public static int[] generateSortedArray(int size) {
	        int[] array = new int[size];
	        for (int i = 0; i < size; i++) {
	            array[i] = i + 1;
	        }
	        return array;
	    }

	    public static int[] generateRandomArray(int size) {
	        int[] array = generateSortedArray(size);
	        Random rand = new Random();
	        for (int i = array.length - 1; i > 0; i--) {
	            int index = rand.nextInt(i + 1);
	            swap(array, i, index);
	        }
	        return array;
	    }

	    public static int[] generateReversedArray(int size) {
	        int[] array = new int[size];
	        for (int i = 0; i < size; i++) {
	            array[i] = size - i;
	        }
	        return array;
	    }
	}

