//package Array;
//import java.util.ArrayList;
//import java.util.Scanner;
//public class Intersection_two_sorted_array {
//    public static void intersectionArray(int[] s1,int[] s2){
//        ArrayList<Integer> list = new ArrayList<>();
//        int i = 0;
//        int j = 0;
//        int m = s1.length;
//        int n = s2.length;
//        while(i<m && j<n){
//            if(s1[i] < s2[j])
//                i++;
//            else if(s2[j] < s1[i])
//                j++;
//            else{
//               list.add(s1[i]);
//               i++;
//               j++;
//            }
//        }
//        for(int it : list){
//            System.out.print(it + " ");
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length of the 1st array ");
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Enter the length of the 2nd array ");
//        int m = sc.nextInt();
//        int[] arr1 = new int[m];
//        for(int i=0;i<arr1.length;i++){
//            arr1[i] = sc.nextInt();
//        }
//        intersectionArray(arr,arr1);
//    }
//}
