//package Array;
//import java.util.Scanner;
//public class max_Product_Subarray {
//    public static int maxProduct(int[] nums){
//        int prefix = 1;
//        int suffix = 1;
//        int max_product = Integer.MIN_VALUE;
//        for(int i=0;i<nums.length;i++){
//            if(prefix == 0)
//                prefix = 1;
//            if(suffix == 0)
//                suffix = 1;
//            prefix = prefix * nums[i];
//            suffix = suffix * nums[nums.length-i-1];
//            max_product = Math.max(max_product, Math.max(prefix,suffix));
//        }
//        return max_product;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length of the array ");
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Maximum subarray product is " + maxProduct(arr));
//    }
//}
