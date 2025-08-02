//package Array;
//import java.util.Scanner;
//public class Majority_Element {
//    public static int majority_element(int[] arr){
//
//       int ele = 0;
//       int cnt = 0;
//       for(int i=0;i<arr.length;i++){
//           if(cnt == 0){
//               cnt = 1;
//               ele = arr[i];
//           }
//           else if(arr[i] == ele)
//               cnt++;
//           else
//               cnt--;
//       }
//       int total = 0;
//       for(int i=0;i<arr.length;i++){
//           if(arr[i] == ele)
//               total++;
//       }
//       if(total > (arr.length/2))
//           return ele;
//       return -1;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length of the array ");
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(majority_element(arr));
//    }
//}
