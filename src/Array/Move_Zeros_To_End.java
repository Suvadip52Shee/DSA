//package Array;
//import java.util.*;
//public class Move_Zeros_To_End {
//    public static void moveZerosToEnd(int[] arr){
//        int j = 0;
//        while(arr[j] != 0){
//            j++;
//        }
//        for(int i=j+1;i<arr.length;i++){
//            if(arr[i] != 0){
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                j++;
//            }
//        }
//        System.out.println("The resultant array is ");
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length of the array ");
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        moveZerosToEnd(arr);
//    }
//}
