//package Array;
//import java.util.Scanner;
//import java.util.HashMap;
//public class Two_Sum {
////    public static void two_Sum(int[] arr,int target){
////        int i = 0;
////        int j = arr.length-1;
////        while(i < j){
////            int sum = arr[i] + arr[j];
////            if(sum == target){
////                System.out.print("We found the target value ");
////                break;
////            }
////            else if(sum < target)
////                i++;
////            else
////                j--;
////        }
////        System.out.println("We didn't find the target value ");
////    }
//public static void two_Sum(int[] nums, int target) {
//    int[] result = new int[2];
//    result[0] = -1;
//    result[1] = -1;
//    HashMap<Integer,Integer> map = new HashMap<>();
//    for(int i=0;i<nums.length;i++){
//        int remaining = target - nums[i];
//        if(map.containsKey(remaining)){
//            result[0] = map.get(remaining);
//            result[1] = i;
//        }
//        map.put(nums[i],i);
//    }
//    for(int i=0;i<result.length;i++){
//        System.out.print(result[i] + " ");
//    }
//}
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length of the array ");
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Enter the target ");
//        int target = sc.nextInt();
//         two_Sum(arr,target);
//    }
//}
