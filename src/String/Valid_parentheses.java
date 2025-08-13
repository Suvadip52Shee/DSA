//package String;
//import java.util.*;
//public class Valid_parentheses {
////    Brute Force Approach
////    public static String validParentheses(String st){
////       StringBuilder sb = new StringBuilder();
////       int balance = 0;
////       int start = 0;
////       for(int i=0;i<st.length();i++){
////           char c = st.charAt(i);
////           if(c == '(')
////               balance++;
////           else
////               balance--;
////           if(balance == 0){
////               sb.append(st.substring(start+1,i));
////               start = i+1;
////           }
////       }
////       return sb.toString();
////    }
////    Better Approach
//    public static String validParentheses(String st){
//        StringBuilder sb = new StringBuilder();
//        int balance = 0;
//        for(int i=0;i<st.length();i++){
//            char c = st.charAt(i);
//            if(c == '('){
//                if(balance > 0) {
//                    sb.append(c);
//                }
//                balance ++;
//            }
//            else{
//                balance--;
//                if(balance > 0){
//                    sb.append(c);
//                }
//            }
//        }
//        return sb.toString();
//    }
//    public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the string : ");
//    String st = sc.next();
//    System.out.println("The valid parentheses is " + validParentheses(st));
//    }
//}
