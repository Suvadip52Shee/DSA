//package Array;
//import java.util.*;
//
//public class Leaders_In_Array {
//    public static void leaderArray(int[] nums){
//        int max_value = Integer.MIN_VALUE;
//        int n = nums.length;
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i=n-1;i>=0;i--){
//            if(nums[i] > max_value){
//                max_value = Math.max(max_value,nums[i]);
//                list.add(nums[i]);
//            }
//        }
//        Collections.reverse(list);
//        for(int i=0;i<list.size();i++){
//            System.out.print(list.get(i) + " ");
//        }
//
//    }
//    public static void main(String[] args) {
//        System.out.println("Enter the length of the array ");
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        leaderArray(arr);
//    }
//}
