/*
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */


 fun LC28(haystack:String,needle:String):Int{
    var pointer1= 0
    var pointer2= 0
    var result =0
    while(pointer2 < needle.length && pointer1 < haystack.length){
        if(needle[pointer2] == haystack[pointer1]){
            pointer1++
            pointer2++
            result=0
        }
        else{
            result =-1
            break
        }

    }
    return result
 }

 fun LC28A(haystack:String,needle:String):Int{
    if(needle.isEmpty()) return 0

    var pointer1=0
    while(pointer1<=haystack.length-needle.length){
        var temp = pointer1
        var pointer2=0
        while(pointer2<needle.length && haystack[temp]==needle[pointer2]){
            temp++
            pointer2++
        }
        if(pointer2==needle.length){
            return pointer1
        }
        pointer1++
    }
    return -1
 }

 println("Use Case1: ${LC28A("sadbutsad","sad")}")
 println("Use Case2: ${LC28A("leetcode","eet")}")