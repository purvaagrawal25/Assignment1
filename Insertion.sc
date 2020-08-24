class Insertion {
  def input() {
    var arr: Array[Int] = Array(23, 45, 3, 88, 5, 1, 30, 100, 19, 66)
    for (i <- 1 until arr.length) {
      var key = arr(i)
      var  j = i - 1

      while (j >= 0 && arr(j) > key) {
        arr(j + 1) = arr(j)
        j = j - 1
      }
      arr(j+1)= key
    }
      for (i <- 0 to arr.length - 1)
      println(arr(i))
  }
}
var obj=new Insertion()
obj.input()