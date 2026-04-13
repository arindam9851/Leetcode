/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4

╔══════════════════════════════════════════════════════════════╗
║                    BINARY SEARCH LOGIC                      ║
╚══════════════════════════════════════════════════════════════╝

📌 WHEN TO USE
   ✔ Array is SORTED
   ✔ Need fast search
   ✔ Time Complexity = O(log n)

──────────────────────────────────────────────────────────────

🧠 CORE IDEA
   Find MID → Compare → Remove Half

   target == nums[mid]  → FOUND
   target >  nums[mid]  → go RIGHT
   target <  nums[mid]  → go LEFT

──────────────────────────────────────────────────────────────

📍 POINTERS

   left = 0
   right = nums.size - 1

   while (left <= right)

──────────────────────────────────────────────────────────────

📍 MID FORMULA

   mid = left + (right - left) / 2

   ❌ Avoid:
      mid = (left + right) / 2

──────────────────────────────────────────────────────────────

📍 POINTER MOVEMENT

   if (nums[mid] == target)
       return mid

   else if (nums[mid] < target)
       left = mid + 1

   else
       right = mid - 1

──────────────────────────────────────────────────────────────

✅ KOTLIN TEMPLATE

fun binarySearch(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size - 1

    while (left <= right) {
        val mid = left + (right - left) / 2

        when {
            nums[mid] == target -> return mid
            nums[mid] < target -> left = mid + 1
            else -> right = mid - 1
        }
    }

    return -1
}

──────────────────────────────────────────────────────────────

📍 EXAMPLE

   nums   = [1, 3, 5, 7, 9, 11]
   target = 7

   left=0, right=5
   mid=2 → nums[mid]=5
   7 > 5 → go RIGHT

   left=3, right=5
   mid=4 → nums[mid]=9
   7 < 9 → go LEFT

   left=3, right=3
   mid=3 → nums[mid]=7
   ✅ FOUND

──────────────────────────────────────────────────────────────

⚠ IMPORTANT RULES

   ✔ Use while (left <= right)
   ✔ Move by mid + 1 or mid - 1
   ✔ Never do:
       left = mid
       right = mid
     → can cause infinite loop

──────────────────────────────────────────────────────────────

🎯 EASY MEMORY TRICK

   "SORTED ARRAY → CHECK MID → CUT HALF"

──────────────────────────────────────────────────────────────

📦 COMPLEXITY

   Time  = O(log n)
   Space = O(1)

──────────────────────────────────────────────────────────────

🔥 COMMON VARIATIONS

   ✔ Search target
   ✔ Search insert position
   ✔ First occurrence
   ✔ Last occurrence
   ✔ Lower bound / Upper bound
   ✔ Rotated sorted array
   ✔ Binary search on answer

╔══════════════════════════════════════════════════════════════╗
║ REMEMBER: Binary Search = Eliminate Half Every Time 🚀      ║
╚══════════════════════════════════════════════════════════════╝

 */

fun LC35(nums: IntArray, target: Int):Int{
    var left =0
    var right= nums.size-1
    while(left<=right){
        var mid = left + (right-left)/2
        if(nums[mid]==target){
            return mid
        }
        else if(nums[mid]<target){
            left=mid+1
        }
        else{
            right=mid-1
        }
    }
    return left
}


println("Use Case1: ${LC35(intArrayOf(1,3,5,6),5)}")
println("Use Case2: ${LC35(intArrayOf(1,3,5,6),2)}")
println("Use Case3: ${LC35(intArrayOf(1,3,5,6),7)}")