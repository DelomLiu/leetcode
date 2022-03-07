class Solution {
    public int minArray(int[] numbers) {
        int left=0, right=numbers.length-1, mid;
        while(left < right) {
            mid = left + ((right-left)>>1);
            if(numbers[mid] < numbers[right])
                right = mid;
            else if(numbers[mid] > numbers[right])
                left = mid+1;
            else
                right--;
        }
        return numbers[left];
    }
}