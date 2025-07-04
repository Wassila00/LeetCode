class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        
        String output = strs[0];

        for (int i = 1; i < strs.length; i++) {
            
            while (!strs[i].startsWith(output)) {
                output = output.substring(0, output.length() - 1);
                if (output.isEmpty()) return "";
            }
        }

        return output;
    }
}
