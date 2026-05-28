import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Input: nums = [2, 7, 11, 15], target = 9
//
//        Output: [0, 1]
//
//        Explanation: Because nums[0] + nums[1] == 2 + 7 == 9, we return [0, 1].
//array can be unsorted
public class twoSum {
    public static void main(String[] args) {
        int[] nums ={3,3,2,9};
        int target = 5;
        System.out.println("data");
        List<Integer> ls;
        ls = findTwoSumIndex(nums, target);
        System.out.println(ls);

    }
//    static List<Integer> findTwoSumIndex(int[] nums, int target) {
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i = 0; i< nums.length; i++) {
//            for(int j =i+1 ;j<nums.length;j++) {
//               if( target == nums[i] +nums[j]) {
//                   list.add(i);
//                   list.add(j);
//                   return list;
//
//               }
//
//
//            }
//        }
//        return list;
//
//    }

    static List<Integer>findTwoSumIndex(int[] nums,int target) {
        Map<Integer,Integer> seen = new HashMap<>();
        int complement;
        for(int i = 0; i< nums.length; i++) {
            complement = target- nums[i];
            if(seen.containsKey(complement)) {
                return List.of(seen.get(complement),i);
            }
            if(!seen.containsKey(nums[i])) {
                seen.put(nums[i], i);
            }

        }
        return new ArrayList<>();
    }
}
