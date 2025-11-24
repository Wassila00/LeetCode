class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for (int i=0;i<nums.length;i++){
            
            if(map.containsKey(nums[i])){
                int index =map.get(nums[i])+1;
                map.replace(nums[i],index);
            }else{
                map.put(nums[i],1);
            }
        }
        int[] res=new int[k];
        Map<Integer, Integer> sortedMap =
        map.entrySet()
           .stream()
           .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
           .collect(Collectors.toMap(
                   Map.Entry::getKey,
                   Map.Entry::getValue,
                   (e1, e2) -> e1,
                   LinkedHashMap::new
           ));
            int count=0;
        for(Integer key:sortedMap.keySet()){
           if (count == k) break;
            res[count]=key;
            count++;
        }return res;


    }
}