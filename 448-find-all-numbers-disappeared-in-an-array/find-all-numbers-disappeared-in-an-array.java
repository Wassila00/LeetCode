class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set=new HashSet<Integer>();
        int n=nums.length;
        for(int i=1;i<n+1;i++){
            set.add(i);
        }
        for(int num:nums){
            set.remove(num);
        }
        return new ArrayList<>(set);
    }
}