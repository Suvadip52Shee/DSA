//package Array;
//import java.util.*;
//public class Remove_Duplicates {
//    public static int remove_duplicates(int[] arr){
//        HashSet<Integer> set = new HashSet<>();
//        for(int i=0;i<arr.length;i++){
//            set.add(arr[i]);
//        }
//
//        int j=0;
//        for(int s : set){
//            arr[j] = s;
//             j++;
//      }
//        return j;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length of the array ");
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(remove_duplicates(arr));
//    }
//}
