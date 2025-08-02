//package Array;
//import java.util.Scanner;
//public class Max_Consecutive_One {
//    public static int consecutive_one(int[] arr){
//        if(arr.length == 0)
//            return -1;
//        int count = 0;
//        int max_count = 0;
//        int n = arr.length;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i] == 1)
//                count++;
//            else
//                count = 0;
//            max_count = Math.max(count,max_count);
//        }
//        return max_count;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length of the array ");
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Maximum consecutive one is : "+ consecutive_one(arr));
//    }
//}
