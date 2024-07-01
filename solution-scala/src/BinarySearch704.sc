object Solution {
  def search(nums: Array[Int], target: Int): Int = {
    var l = 0
    var r = nums.length - 1

    while (l <= r) {
      val mid = l + (r - l) / 2
      if (nums(mid) == target) {
        return mid
      } else if (nums(mid) < target) {
        l = mid + 1
      } else {
        r = mid - 1
      }
    }
    -1
  }
}