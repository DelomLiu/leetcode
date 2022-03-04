题目：
给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。

如果可以，返回 true ；否则返回 false 。

magazine 中的每个字符只能在 ransomNote 中使用一次。

示例1：
输入：ransomNote = "a", magazine = "b"
输出：false

示例2：
输入：ransomNote = "aa", magazine = "ab"
输出：false

示例3：
输入：ransomNote = "aa", magazine = "aab"
输出：true

思路：
构建一个大小为26的int型数组，表示小写字母的数量，
先统计magazine中的数量，再减去ransomNote中的数量，判断是否有负数即可。