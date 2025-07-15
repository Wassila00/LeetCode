class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = (int)1e9;
        int answer = right;
        
        while (left <= right) {
            int k = left + (right - left) / 2;
            
            long hours = 0;
            for (int pile : piles) {
                hours += (pile + k - 1) / k;
            }
            
            if (hours <= h) {
                answer = k;
                right = k - 1;
            } else {
                left = k + 1;
            }
        }
        
        return answer;
    }
}
