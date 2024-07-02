object Solution {
  def sortedSquares(nums: Array[Int]): Array[Int] = {
    nums.map(n => n*n).sorted
  }
}

//next use two pointer?