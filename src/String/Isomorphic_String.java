//package String;
//import java.util.*;
//public class Isomorphic_String {
//    public static boolean check_Isomorphic(String st1,String st2){
//        if(st1.length() != st2.length())
//            return false;
//        HashMap<Character,Character> hashmap = new HashMap<>();
//        for(int i=0;i<st1.length();i++){
//            if(!hashmap.containsKey(st1.charAt(i))){
//                if(hashmap.containsValue(st2.charAt(i)))
//                     return false;
//                hashmap.put(st1.charAt(i),st2.charAt(i));
//            }
//            else{
//                if(hashmap.get(st1.charAt(i)) != st2.charAt(i)){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the first string ");
//     String st1 = sc.next();
//     System.out.println("Enter the second string ");
//     String st2 = sc.next();
//        System.out.println("The statement two string is isomorphic : " + check_Isomorphic(st1,st2));
//    }
//}
