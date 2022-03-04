class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] temp = new int[26];
        for (int i=0; i<magazine.length(); i++) {
            temp[magazine.charAt(i)-'a']++;
        }
        int index;
        for (int i=0; i<ransomNote.length(); i++) {
            index = ransomNote.charAt(i)-'a';
            temp[index]--;
            if (temp[index]<0)
                return false;
        }
        return true;
    }
}