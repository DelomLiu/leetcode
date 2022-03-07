class Solution {
    public int missingNumber(int[] nums) {
        int left = 0, right = nums.length-1, mid;
        while(left < right) {
            mid = left + ((right - left) >> 1);
            if(nums[mid] == mid)
                left = mid+1;
            else
                right = mid;
        }
        return nums[left]==left ? left+1 : left;
    }
}