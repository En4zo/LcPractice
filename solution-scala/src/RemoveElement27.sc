object Solution {
  def removeElement(nums: Array[Int], `val`: Int): Int = {
    var r = 0
    var l = nums.length - 1

    while (r <= l) {
      if (nums(r) == `val`) {
        if (nums(l) != `val`) {
          val temp = nums(l)
          nums(r) = temp
          nums(l) = -4
          r += 1
          l -= 1
        } else {
          nums(l) = -4
          l -= 1
        }
      } else {
        r += 1
      }
    }
    r
  }
}