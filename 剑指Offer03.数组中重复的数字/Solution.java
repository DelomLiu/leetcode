import java.util.Arrays;
class Solution {
    public int findRepeatNumber(int[] nums) {

        //先排序，后查找，时间复杂度O(nlogn)，空间复杂度O(1)
        Arrays.sort(nums);
        for (int i=0; i<nums.length-1; i++) {
            if(nums[i] == nums[i+1])
                return nums[i];
        }
        return -1;

        //哈希表，时间复杂度O(n)，空间复杂度O(n)
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int num : nums) {
            if (hash.containsKey(num) == true)
                return num;
            hash.put(num, 1);
        }
        return -1;

        //利用数组下标和数组中元素的值的关系，时间复杂度O(n)，空间复杂度O(1)
        //由于数组长度为n，且数组中的所有数字都在0~n-1的范围内
        for (int i=0; i<nums.length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]])
                    return nums[i];
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        return -1;
    }
}