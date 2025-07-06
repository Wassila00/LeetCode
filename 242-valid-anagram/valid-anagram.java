class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> a = new HashMap<>();
        HashMap<Character, Integer> b = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            a.put(c1, a.getOrDefault(c1, 0) + 1);
            b.put(c2, b.getOrDefault(c2, 0) + 1);
        }

        return a.equals(b);
    }
}
