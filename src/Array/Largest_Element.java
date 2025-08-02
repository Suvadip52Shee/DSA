//package Array;
//import java.util.Scanner;
//public class Largest_Element{
//    public static int largest(int[] arr){
//        if(arr == null || arr.length == 0)
//            throw new IllegalArgumentException("Array must not be empty");
//        int largest = arr[0];
//        for(int i=1;i<arr.length;i++){
//            if(arr[i] > largest){
//                largest = arr[i];
//            }
//        }
//        return largest;
//    }
//    public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the length of the array ");
//    int N = sc.nextInt();
//    int[] arr = new int[N];
//    for(int i=0;i<arr.length;i++){
//        arr[i] = sc.nextInt();
//    }
//        System.out.println("The largest element is " + largest(arr));
//    }
//}
