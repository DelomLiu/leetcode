class Solution {
    public int numberOfSteps(int num) {

        int ans = 0;
        while (num!=0) {
            ans++;
            if(num%2 == 0)
                num/=2;
            else
                num--;
        }
        return ans;
    }
}