//package String;
//import java.util.Scanner;
//public class Rotation_Of_Another {
////    Brute Force Approach
////    public static boolean checkRotation(String st1,String goal){
////         for(int i=0;i<st1.length();i++){
////             char c = st1.charAt(0);
////             st1 = st1.substring(1)+c;
////             if(st1.equals(goal)){
////                 return true;
////             }
////         }
////         return false;
////    }
////    Better Approach
//    public static boolean checkRotation(String st,String goal){
//       StringBuilder sb = new StringBuilder(st);
//       for(int i=0;i<st.length();i++){
//           char c = sb.charAt(0);
//           sb.deleteCharAt(0);
//           sb.append(c);
//           if(sb.toString().equals(goal)){
//               return true;
//           }
//       }
//       return false;
//    }
//
//    public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the string : ");
//     String st = sc.next();
//     System.out.println("Enter the rotated string : ");
//     String goal = sc.next();
//     System.out.println(checkRotation(st,goal));
//    }
//}
