fun isValid(s: String): Boolean {
    val pairs = mapOf(')' to '(', '}' to '{', ']' to '[')
    val stack = ArrayDeque<Char>()
    
    for (ch in s) {
        if (ch in pairs.values) stack.addLast(ch)
        else if (stack.isEmpty() || stack.removeLast() != pairs[ch]) return false
    }
    return stack.isEmpty()
}

println(isValid("({[]})"))  // true
println(isValid("(]"))      // false
println(isValid("()[]{}")) 
