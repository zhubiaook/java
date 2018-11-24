package array;

public class Array {
    public static void main(String[] args) {
        // Declare array
        int[] arr;

        // Create array
        arr = new int[10];

        // Array assignment
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * i / 2;
        }

        // Array initializer
        int[] arr1 = {9, 8, 7};

        // Array initializer
        int[] arr2;
        arr2 = new int[] {9, 2, 3};

        // Loop through each element in an array
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
