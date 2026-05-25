public class InsertionTwo {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int[] arr2 = new int[arr.length + 1];

        int pos = 2;
        int element = 111;

        for (int i = 0; i < pos; i++) {
            arr2[i] = arr[i];
        }
        arr2[pos] = element;

        for (int i = pos; i < arr.length; i++) {
            arr2[i + 1] = arr[i];
        }

        for (int number : arr2) {
            System.out.print(number + " ");
        }
    }
}
