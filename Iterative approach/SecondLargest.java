public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = { 10, 50, 30, 40, 20, 60, 70, 80, 83, 90, 90 };

        int largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                SecondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > SecondLargest && arr[i] != largest) {
                SecondLargest = arr[i];
            }
        }

        System.out.println(SecondLargest);
    }
}