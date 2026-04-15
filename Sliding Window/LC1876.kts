/*
A string is good if there are no repeated characters.

Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.

Note that if there are multiple occurrences of the same substring, every occurrence should be counted.

A substring is a contiguous sequence of characters in a string.


Input: s = "xyzzaz"
Output: 1
Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz". 
The only good substring of length 3 is "xyz"
 
 */

 fun LC1876(s:String,k:Int):Int{
    var count =0
    val numberOfSlidingWindow= s.length-k+1
    for(i in 0 until numberOfSlidingWindow){
        var v1= s[i]
        var v2= s[i+1]
        var v3= s[i+2]

        if(v1!=v2 && v2!=v3 && v3!=v1){
            count++
        }
    }
    return count
 }

 println(LC1876("aababcabc",3))