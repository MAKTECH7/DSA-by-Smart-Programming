public class Searching {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int pos = -1;
        int element = 30;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Element doesn't exist");
        } else {

            System.out.println("the " + element + " found at index " + pos);
        }
    }
}