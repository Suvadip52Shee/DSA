//package Array;
//import java.util.Scanner;
//
//public class Next_Permutation {
//    public static void reverse(int[] arr,int s,int e){
//        while(s<=e){
//            int temp = arr[s];
//            arr[s] = arr[e];
//            arr[e] = temp;
//            s++;
//            e--;
//        }
//    }
//    public static void nextPermutation(int[] arr){
//        int n = arr.length;
//        int index = 0;
//        for(int i=n-2;i>=0;i--){
//            if(arr[i] < arr[i+1]){
//                index = i;
//                break;
//            }
//        }
//        for(int i=n-1;i>=index;i--){
//            if(arr[i] > arr[index]){
//                int temp = arr[i];
//                arr[i] = arr[index];
//                arr[index] = temp;
//                break;
//            }
//        }
//        reverse(arr,index+1,n-1);
//        System.out.println("The permutation array is : ");
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i] + " ");
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length of the array ");
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        nextPermutation(arr);
//    }
//}
