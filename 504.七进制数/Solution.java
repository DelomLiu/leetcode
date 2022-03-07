class Solution {
    public String convertToBase7(int num) {

        //return Integer.toString(num, 7);

        if (num == 0)
            return String.valueOf(0);
        StringBuilder sb = new StringBuilder();
        int flag = 1; //用于表示符号，num是正是负
        if (num < 0) {
            flag = -1;
            num = -num;
        }
        //转化为7进制
        while (num != 0) {
            sb.append(String.valueOf(num % 7));
            num = num / 7;
        }
        if (flag == -1)
            sb.append('-');
        //变成字符串输出
        return sb.reverse().toString();
    }
}