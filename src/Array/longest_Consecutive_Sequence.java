//package Array;
//import java.util.HashSet;
//import java.util.Scanner;
//import java.util.Set;
//
//public class longest_Consecutive_Sequence {
//    public static void longest_Sequence(int[] arr){
//        Set<Integer> set = new HashSet<>();
//        if(arr.length == 0) {
//            System.out.println("O");
//            return;
//        }
//        for(int it : arr){
//            set.add(it);
//        }
//        int longest_Length = 1;
//        int cnt = 0;
//        for(int i=0;i<arr.length;i++){
//            if(!set.contains(arr[i]-1)){
//                 cnt = 1;
//                 int x = arr[i];
//                 while(set.contains(x+1)) {
//                     cnt++;
//                     x = x + 1;
//                 }
//            }
//            longest_Length = Math.max(longest_Length,cnt);
//        }
//        System.out.println(longest_Length);
//    }
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length of the array ");
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        longest_Sequence(arr);
//    }
//}
