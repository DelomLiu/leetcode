class Solution {
    public int romanToInt(String s) {
        int ans=0;
        int len=s.length();
        int index=0;

        HashMap<String, Integer> hash = new HashMap<>();
        hash.put("IV", 4);
        hash.put("IX", 9);
        hash.put("XL", 40);
        hash.put("XC", 90);
        hash.put("CD", 400);
        hash.put("CM", 900);
        hash.put("I", 1);
        hash.put("V", 5);
        hash.put("X", 10);
        hash.put("L", 50);
        hash.put("C", 100);
        hash.put("D", 500);
        hash.put("M", 1000);

        while (index<len) {
            char c = s.charAt(index);
            //判断是不是特殊规则
            if ((c=='I' || c=='X' || c=='C') && index < len-1) {
                String temp = String.valueOf(c) + s.charAt(index+1);
                //对特殊规则进行操作
                if (hash.containsKey(temp)) {
                    ans += hash.get(temp);
                    index += 2;
                } else { //对I、X、C进行操作
                    ans += hash.get(String.valueOf(c));
                    index +=1;
                }
            } else {
                ans += hash.get(String.valueOf(c));
                index +=1;
            }
        }

        return ans;
    }
}