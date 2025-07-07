class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int maxCount = 0;
        int result = 0;
        
        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);
            
            int windowLen = right - left + 1;
            
            if (windowLen - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            
            result = Math.max(result, right - left + 1);
        }
        
        return result;
    }
}
