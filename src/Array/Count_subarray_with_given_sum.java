//package Array;
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class Count_subarray_with_given_sum {
//    public static int count_subarray(int[] arr,int k){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        int sum = 0;
//        int cnt = 0;
//        map.put(0,1);
//        for(int i=0;i<arr.length;i++){
//           sum += arr[i];
//           int preSum = sum - k;
//           if(map.containsKey(preSum)){
//               cnt += map.get(preSum);
//           }
//           map.put(sum,map.getOrDefault(sum,0)+1);
//        }
//        return cnt;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length of the array ");
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Enter the sum ");
//        int sum = sc.nextInt();
//        System.out.println("Number of subarray with given sum k is : "+ count_subarray(arr,sum));;
//    }
//}
