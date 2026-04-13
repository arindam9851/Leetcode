/*
Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.

Example 1:

Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Example 2:

Input: s = "abcd", k = 2
Output: "bacd"


 */


 fun LC541(s: String, k: Int):String{

    var chars = s.toCharArray()
    var n= chars.size
    var start = 0
    while(start<n){
         var left = start
        var right = left+k-1

        while(left<right){
            var temp = chars[left]
            chars[left]=chars[right]
            chars[right]=temp
            left++
            right--
        }
        start += 2*k
    }
    return String(chars)

 }

 println(LC541("abcdefg",2))