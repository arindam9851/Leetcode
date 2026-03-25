
/* 
Example 1:
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/

fun removeElement(nums: IntArray, element:Int):Int{
    var i = 0

    for (j in nums.indices) {
        if (nums[j] != element) {
            nums[i] = nums[j]
            i++
        }
       println("Array ${nums.joinToString(", ")}")
    }
    return i

}
//Two pointer approch , one pointer is from start and another is from end
fun removeElement1(nums: IntArray, element:Int):Int{
    var left =0
    var right = nums.size-1

    while(left<=right){
        if(nums[left]==element){
            nums[left]=nums[right]
            right--
        }
        else{
            left++
        }
    }
    return left
}

println("Use Case1: ${removeElement1(intArrayOf(3,2,2,3),3)}")
println("Use Case2: ${removeElement(intArrayOf(0,1,2,2,3,0,4,2),2)}")