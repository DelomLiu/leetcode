题目：

给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

你可以按任意顺序返回答案。

示例1：

输入：nums = [2,7,11,15], target = 9

输出：[0,1]

解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。

示例2：

输入：nums = [3,2,4], target = 6

输出：[1,2]

示例3：

输入：nums = [3,3], target = 6

输出：[0,1]


思路：

首先想到的是双指针，用一个指针指向一个数，另一个指针循环遍历，找出和为target的数值。时间复杂度为O(n^2)

其次是利用hash表，将nums中的num和下标i当作hash表中的key和value，利用hash.containsKey()函数进行查找。时间复杂度为O(n)
