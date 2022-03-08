class Solution {
    public char firstUniqChar(String s) {

        int[] letter = new int[26];
        for (char c : s.toCharArray()) {
            letter[c-'a']++;
        }
        for (char c : s.toCharArray()) {
            if(letter[c-'a'] == 1)
                return c;
        }
        return ' ';
    }
}