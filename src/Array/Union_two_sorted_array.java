package Array;
//
//public class Union_two_sorted_array {
//    public int[] unionArray(int[] nums1, int[] nums2) {
//        int n = nums1.length;
//        int m = nums2.length;
//        int[] union = new int[m+n];
//        int i = 0;
//        int j = 0;
//        int k = 0;
//        while(i<n && j<m){
//            if(nums1[i]<= nums2[j]){
//                if((union.length == 0) ||(union[union.length-1]) != nums1[i]){
//                    union[k] = nums1[i];
//                }
//                i++;
//                k++;
//            }
//            else{
//                if((union.length == 0) ||(union[union.length-1]) != nums2[j]){
//                    union[k] = nums2[j];
//                }
//                j++;
//                k++;
//            }
//        }
//        while(i<n){
//            if((union.length == 0) ||(union[union.length-1]) != nums1[i]){
//                union[k] = nums1[i];
//            }
//            i++;
//            k++;
//        }
//        while(j<m){
//            if((union.length == 0) ||(union[union.length-1]) != nums2[j]){
//                union[k] = nums2[j];
//            }
//            j++;
//            k++;
//        }
//        return union;
//    }
//    public static void main(String[] args) {
//
//    }
//}
