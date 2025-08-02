//package Array;
//import java.util.Scanner;
//import java.util.HashMap;
////// This code is implemented for all the subcases like contains all the positive and negative numbers.
//public class Longest_Subarray_Sum_K {
//    public static int longestSubarray(int[] num, int k){
//        HashMap<Integer,Integer> preSum = new HashMap<>();
//        int sum =0;
//        int maxLen = 0;
//        for(int i=0;i<num.length;i++){
//            sum += num[i];
//            if(sum == k){
//                maxLen = Math.max(maxLen,i+1);
//            }
//            int rest = sum-k;
//            if(preSum.containsKey(rest)){
//                int len = i - preSum.get(rest);
//                maxLen = Math.max(len,maxLen);
//            }
//            if(!preSum.containsKey(sum)){
//                preSum.put(sum,i);
//            }
//        }
//        return maxLen;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length of the array ");
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Enter the sum : ");
//        int sum = sc.nextInt();
//        System.out.println("Longest length subarray sum is : "+ longestSubarray(arr,sum));
//    }
//}
