//package Array;
//import java.util.*;
//public class LeftRotation {
//    public static void reverse(int[] arr,int fi,int li){
//        while(fi<=li){
//            int temp = arr[fi];
//            arr[fi] = arr[li];
//            arr[li] = temp;
//            fi++;
//            li--;
//        }
//    }
////    public static void leftRotation(int[] arr,int D){
////        reverse(arr,0,D-1);
////        reverse(arr,D,arr.length-1);
////        reverse(arr,0,arr.length-1);
////        System.out.println("For left rotation array will be looks like ");
////        for(int i=0;i<arr.length;i++){
////            System.out.print(arr[i] +" ");
////        }
////    }
//    public static void rightRotation(int[] arr,int D){
//        int N = arr.length;
//        reverse(arr,0,N-D-1);
//        reverse(arr,N-D,N-1);
//        reverse(arr,0,N-1);
//        System.out.println("For right rotation array will be looks like ");
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i] +" ");
//        }
//    }
//    public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length of the array ");
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("The number of rotation in the array :");
//        int D = sc.nextInt();
////        leftRotation(arr,D);
//        rightRotation(arr,D);
//    }
//}
