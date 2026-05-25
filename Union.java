public class Union {
    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 30, 40 };
        int[] arr2 = { 30, 40, 50, 60 };

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] newArr = new int[n1 + n2];
        int index = 0;
        for (int i = 0; i < n1; i++) {
            newArr[index] = arr1[i];
            index++;
        }
        for (int i = 0; i < n2; i++) {// this is for currrent element checking to new arr
            boolean isDuplicate = false;
            for (int j = 0; j < newArr.length; j++) {// this is searching the element from new arr and compare with
                                                     // current element
                if (arr2[i] == newArr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                newArr[index] = arr2[i];
                index++;
            }
        }
        for (int no : newArr) {
            System.out.print(no + " ");
        }
    }
}
