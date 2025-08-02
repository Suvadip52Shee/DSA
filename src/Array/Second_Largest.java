//package Array;
//
//import java.util.Scanner;
//
//public class Second_Largest {
//    public static int secondLargest(int[] nums){
//        int largest = nums[0];
//        int second = -1;
//        if(nums.length == 0 || nums.length == 1)
//            return -1;
//        for(int i=1;i<nums.length;i++){
//            if(nums[i] > largest){
//                second = largest;
//                largest = nums[i];
//            }
//            else if(nums[i] > second && nums[i] < largest){
//                second = nums[i];
//            }
//
//        }
//        return second;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length of the array ");
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println("The largest element is " + secondLargest(arr));
//    }
//}
