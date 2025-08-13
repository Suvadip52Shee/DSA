//package String;
//import java.util.*;
//public class Reverse_Word_Of_String {
////    public static String reverseWordInString(String st){
////        st = st.trim();
////        String[] words = st.split("\\s+");
////        StringBuilder sb = new StringBuilder();
////        for(int i=words.length-1;i>=0;i--){
////            sb.append(words[i]);
////            if(i != 0)
////                sb.append(" ");
////        }
////        return sb.toString();
////    }
//    public static String reverseWordInString(String st){
//        List<String> list = new ArrayList<>();
//        int i = 0;
//        int n = st.length();
//        while(i < n){
//            while(i<n && (st.charAt(i) == ' ')){
//                i++;
//            }
//            int j = i;
//            while(j<n && (st.charAt(j) != ' ')){
//                j++;
//            }
//            if(i < j){
//                list.add(st.substring(i,j));
//            }
//            i = j;
//        }
//         Collections.reverse(list);
//         return String.join(" ",list);
//    }
//    public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      System.out.println("Enter the sentence ");
//      String st = sc.nextLine();
//      String result = reverseWordInString(st);
//      System.out.print(result);
//    }
//}
