//package Array;
//
//import java.util.Scanner;
//
//public class Stock_Buy_Cell {
//    public static void max_profit(int[] arr){
//        int min_buy_price = arr[0];
//        int max_profit = Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            int profit = arr[i] - min_buy_price;
//            max_profit = Math.max(profit,max_profit);
//            min_buy_price = Math.min(min_buy_price,arr[i]);
//        }
//        System.out.println("Maximum profit earned : " + max_profit);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length of the array ");
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        max_profit(arr);
//    }
//}
