题目：

给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。

示例1：

输入：head = [1,2,2,1]

输出：true

示例2：

输入：head = [1,2]

输出：false

思路：

主要分为三个步骤：首先找到中点，其次翻转中点之后的节点，最后从中点开始和起点进行比较。
