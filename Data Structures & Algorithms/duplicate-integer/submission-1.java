
class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
        }
     }
