//package String;
//import java.util.*;
//public class AnagramCheck {
//    public static boolean checkAnagram(String s,String t){
//        int n = s.length();
//        int[] freq = new int[26];
//        for(int i=0;i<n;i++){
//            freq[s.charAt(i)-'a']++;
//            freq[t.charAt(i)-'a']--;
//        }
//        for(int i=0;i<26;i++){
//            if(freq[i] > 0)
//                return false;
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first string ");
//        String st1 = sc.next();
//        System.out.println("Enter the second string ");
//        String st2 = sc.next();
//        System.out.println(checkAnagram(st1,st2));
//
//    }
//}
