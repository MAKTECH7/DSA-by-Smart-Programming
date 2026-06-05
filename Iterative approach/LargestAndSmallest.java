// package Iterative approach;

public class LargestAndSmallest {

    public static void main(String[] args) {
        
        int[] arr = {10,40,20,80,60,30,10,50};
        
        int max = arr[0];
        int min = arr[0];
        for(int i =0; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];;
            }
            if(arr[i]<min){
                min=arr[i];;
            }
            
        }
        System.out.println(max);
        System.out.println(min);
    }
}
