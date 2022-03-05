class Solution {
    public String reverseLeftWords(String s, int n) {

        //return s.substring(n) + s.substring(0, n);

        StringBuilder sb = new StringBuilder(s);

        reverse(sb, 0, n-1);
        reverse(sb, n, s.length()-1);
        sb.reverse();
        return sb.toString();
    }

    public void reverse(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }
}