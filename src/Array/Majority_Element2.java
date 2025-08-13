//package Array;
//
//
//import java.util.*;
//public class Majority_Element2 {
//    public static List<Integer> majority_Element(int[] nums){
//        List<Integer> list = new ArrayList<>();
//        int cnt1 = 0; int cnt2 = 0;
//        int ele1 = 0; int ele2 = 0;
//        for(int i=0;i<nums.length;i++){
//            if(cnt1 == 0 && (ele2 != nums[i])){
//                cnt1 = 1;
//                ele1 = nums[i];
//            }
//            else if(cnt2 == 0 && (ele1 != nums[i])){
//                cnt2 = 1;
//                ele2 = nums[i];
//            }
//            else if(ele1 == nums[i])
//                cnt1++;
//            else if(ele2 == nums[i])
//                cnt2++;
//            else{
//                cnt1--;
//                cnt2--;
//            }
//        }
//        cnt1 = 0; cnt2 = 0;
//        for(int i=0;i<nums.length;i++){
//            if(ele1 == nums[i])
//                cnt1++;
//            if(ele2 == nums[i])
//                cnt2++;
//        }
//        int min = (nums.length/3)+1;
//        if(cnt1 >= min)
//            list.add(ele1);
//        if(cnt2 >= min)
//            list.add(ele2);
//        return list;
//    }
//    public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the length of the array ");
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//    List<Integer> result = majority_Element(arr);
//        for(int it : result){
//            System.out.print(it + " ");
//        }
//    }
//}
