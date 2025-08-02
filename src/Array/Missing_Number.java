package Array;
//import java.util.Scanner;
//
//public class Missing_Number {
//    public static int missing_Number(int[] arr, int N){
//        Applying XOR
//        int XOR1 = 0;
//        for(int i=1;i<=N;i++){
//            XOR1 = XOR1 ^ i;
//        }
//        int XOR2 = 0;
//        for(int i=0;i<arr.length;i++){
//            XOR2 = XOR2 ^ arr[i];
//        }
//        return XOR1 ^ XOR2;
//        Applying Sum Formula
//        int sum = (N * (N+1))/2;
//        int total = 0;
//        for(int i=0;i<arr.length;i++){
//            total += arr[i];
//        }
//        return sum - total;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length of the array ");
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Enter the total number after adding the missing number ");
//        int total = sc.nextInt();
//        System.out.println("The missing number is " + missing_Number(arr,total));
//    }
//}
