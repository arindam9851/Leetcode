
/*
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Input: s = "Mr Ding"
Output: "rM gniD"
 */
fun LC557(s: String):String{
 var splitArray = s.split(" ")
 var result = StringBuilder()

 for(i in splitArray.indices){
    var char = splitArray[i].toCharArray()
    var left =0
    var right = char.size-1

    while(left<=right){
        var temp = char[left]
        char[left]=char[right]
        char[right]=temp
        left++
        right--
    }
    result.append(String(char)).append(" ")

 }
 return result.toString().trim()
}

println(LC557("Let's take LeetCode contest"))
