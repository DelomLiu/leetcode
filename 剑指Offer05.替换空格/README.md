题目：

请实现一个函数，把字符串 s 中的每个空格替换成"%20"。

示例1：

输入：s = "We are happy."

输出："We%20are%20happy."

思路：

有两种方法，

其一是利用String.replace(str1, str2)函数，将需要替换的字符串写入。

其二是扫描整个String，利用StringBuilder新建立一个字符串。

注意：

StringBuilder的初始化、使用