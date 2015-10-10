object IntOps {

  implicit class IntOps(n: Int) {
    def reverse: Int = n.toString.reverse.toInt
  }
}
