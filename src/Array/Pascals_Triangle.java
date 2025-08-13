//package Array;
//import java.util.*;
//public class Pascals_Triangle {
//    public static List<Integer> pascalTriangle(int row){
//          List<Integer> list = new ArrayList<>();
//          int result = 1;
//          list.add(result);
//          for(int i=1;i<row;i++){
//              result =  result * (row-i);
//              result = result/i;
//              list.add(result);
//          }
//          return list;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of rows : ");
//        int N = sc.nextInt();
//        List<List<Integer>> result = new ArrayList<>();
//        for(int i=1;i<=N;i++){
//            result.add(pascalTriangle(i));
//        }
//        System.out.println("The pascals triangle is :");
//        for(List<Integer> innerlist : result){
//            for(int element : innerlist){
//                System.out.print(element + " ");
//            }
//            System.out.println();
//        }
//    }
//}
