class Solution {
    public String longestCommonPrefix(String[] strs) {
        Boolean stop = false ;
        String prefix =strs[0] ;
        int min=201;
        
        for(int i=1; i<strs.length ;i++){
            while(!strs[i].startsWith(prefix)){
                    prefix=prefix.substring(0,prefix.length()-1);
                    if(prefix.isEmpty())return "";
            }
        }
        return prefix;
    }

}