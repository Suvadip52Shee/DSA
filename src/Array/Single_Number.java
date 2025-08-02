//package Array;
//import java.util.HashMap;
//
//import java.util.*;
//public class Single_Number {
//    public static int singleNumber(int[] arr){
//        int maxVal = 0;
//        for(int num : arr){
//            if(num > maxVal)
//                maxVal = num;
//        }
//        int[] hashing = new int[maxVal + 1];
//        for(int num : arr){
//            hashing[num]++;
//        }
//        for(int num : arr){
//            if(hashing[num] == 1)
//                return num;
//        }
//        return -1;
//        Using HashMap
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<arr.length;i++){
//            int val = map.getOrDefault(arr[i],0);
//            map.put(arr[i],val+1);
//        }
//        for(Map.Entry<Integer,Integer> it : map.entrySet()){
//            if(it.getValue() == 1)
//                return it.getKey();
//        }
//        return -1;
//   }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length of the array ");
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("The number whose occurrence is once "+ singleNumber(arr));
//    }
//}
