class Solution {
    public int search(int[] nums, int target) {
        int left=0, right=nums.length-1;
        while(left<=right){
            int middle = left + (right - left) / 2;
            if(nums[middle]<target) left=middle+1;
            else if(nums[middle]>target) right=middle-1;
                else return middle;
        }
     return -1;
    }
}