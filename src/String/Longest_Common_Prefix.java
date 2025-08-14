//package String;
//import java.util.*;
//public class Longest_Common_Prefix {
//    public static String longestPrefix(String[] st){
//        int n = st.length;
//        String prefix = st[0];
//        for(int i=1;i<n;i++){
//            while(!st[i].startsWith(prefix)){
//                prefix = prefix.substring(0,prefix.length()-1);
//                if(prefix.isEmpty())
//                    return "";
//            }
//        }
//        return prefix;
//    }
//    public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int N = sc.nextInt();
//     System.out.println("Enter the list of string ");
//     String[] st = new String[N];
//     for(int i=0;i<N;i++){
//         st[i] = sc.next();
//     }
//     System.out.println(longestPrefix(st));
//    }
//}
