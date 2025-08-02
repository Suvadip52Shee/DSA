//package Array;
//import java.util.Scanner;
//public class Linear_Search {
//    public static int linearSearch(int[] arr,int target){
//        if(arr == null || arr.length == 0)
//            return -1;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i] == target)
//                return i;
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        System.out.println("Enter the length of the array ");
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Enter the target element : ");
//        int target = sc.nextInt();
//        System.out.println(linearSearch(arr,target));
//    }
//}
