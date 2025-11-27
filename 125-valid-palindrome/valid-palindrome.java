class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> list =new ArrayList<>();
        int i=0;
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                list.add(Character.toLowerCase(c));
            }
        }
        int p1=0;
        int p2=list.size()-1;
        while(p1<=p2){
            if(!list.get(p1).equals(list.get(p2))){
                return false; 
            }
            p1++;
            p2--;
        }return true;

    }
}