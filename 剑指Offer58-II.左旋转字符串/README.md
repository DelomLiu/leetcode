题目：

字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。

示例1：

输入: s = "abcdefg", k = 2

输出: "cdefgab"

示例2：

输入: s = "lrloseumgh", k = 6

输出: "umghlrlose"

思路：

其一是利用String的提取子字符串的方法——s.substring(start, end+1)；

其二是利用翻转，先将String转换为StringBuilder类型，进行三次反转即可。

注意：

StringBuilder.reverse()不需要参数，从头到尾的反转，所以需要重写一个从指定位置的反转。

StringBuilder获取某个位置上的字符和String一样，都是利用sb.charAt(index)

StringBuilder修改某个位置上的字符方法是sb.setCharAt(index, char)