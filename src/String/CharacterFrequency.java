//package String;
//import java.util.*;
//public class CharacterFrequency {
//    public static void countFrequency(String st){
//        Map<Character,Integer> hashMap = new HashMap<>();
//        for(int i=0;i<st.length();i++){
//             hashMap.put(st.charAt(i),hashMap.getOrDefault(st.charAt(i),0)+1);
//        }
//        for(Map.Entry<Character,Integer> entry : hashMap.entrySet()){
//            System.out.println(entry.getKey() +" "+ entry.getValue());
//        }
//    }
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.println("Enter a string : ");
//       String st = sc.next();
//       countFrequency(st);
//    }
//}
