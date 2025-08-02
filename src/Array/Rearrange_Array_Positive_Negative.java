//package Array;
//import java.util.*;
//public class Rearrange_Array_Positive_Negative {
//    public static void rearrangeArray(int[] arr){
//        int n = arr.length;
//        int[] positive = new int[n/2];
//        int[] negative = new int[n/2];
//        int j=0;int k=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i] > 0) {
//                positive[j] = arr[i];
//                j++;
//            }
//            else{
//                negative[k] = arr[i];
//                k++;
//            }
//        }
//        for(int i=0;i<positive.length;i++){
//            arr[2*i] = positive[i];
//            arr[2*i+1] = negative[i];
//        }
//        System.out.println("The rearrange array after alter positives and negatives ");
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i] + " ");
//        }
//    }
//    public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the length of the array ");
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        rearrangeArray(arr);
//    }
//}
