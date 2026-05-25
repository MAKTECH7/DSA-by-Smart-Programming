public class Sorting {
    public static void main(String[] args) {
        int[] arr = { 20, 10, 50, 40, 30 };
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        for (int no : arr) {
            System.out.print(no + " ");
        }
    }
}