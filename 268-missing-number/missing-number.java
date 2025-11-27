class Solution {
    public int missingNumber(int[] nums) {
       int total=0;
       int sum=0;
        for(int i=0;i<nums.length+1;i++){
           total+=i;
            if(i!=nums.length){
                sum+=nums[i];
            }
        }
        int value= total-sum;
        return value;
    }
}