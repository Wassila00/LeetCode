class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<nums.length+1;i++){
            s.add(i);
        }
        for(int i=0;i<nums.length;i++){
            s.remove(nums[i]);
        }
        int value = s.iterator().next();
        return value;
    }
}