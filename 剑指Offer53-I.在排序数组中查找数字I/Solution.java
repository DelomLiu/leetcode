class Solution {
    public int search(int[] nums, int target) {
        int res = 0;
        int left = 0, right = nums.length-1, mid;
        while (left < right) {
            mid = left + ((right - left) >> 1);
            if (nums[mid] < target)
                left = mid+1;
            else
                right = mid;
        }
        while (left<nums.length && nums[left++]==target)
            res++;

        return res;
    }
}