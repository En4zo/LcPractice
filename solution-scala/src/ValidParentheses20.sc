//20. Valid Parentheses

import scala.collection.mutable.Stack

object Solution {
  def isValid(s: String): Boolean = {
    val parenMap = Map[Char, Char]('(' -> ')', '{' -> '}', '[' -> ']')
    val leftParentheses = parenMap.keySet
    var stackRight = Stack[Char]()
    var stackLeft = Stack[Char]()

    if ((s.length % 2) != 0) {
      false
    } else {
      s.foreach(s =>
        //if a parentheses is in left, add to the stack
        if (leftParentheses.contains(s)) {
          stackRight.push(s)
        } else {
          stackLeft.push(0)
          //check validity
          if(!stackRight.isEmpty && parenMap(stackRight.head) == s){
            stackRight.pop()
            stackLeft.pop()
          }
        }
      )
      stackRight.isEmpty && stackLeft.isEmpty
    }
  }
}
