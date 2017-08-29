// Source: https://www.youtube.com/watch?v=xCmHKzYXoko

object scratch {
  println("Hello World!")
  //val jtime = new JavaTime(10, 40)
  //jtime.getHours

  Time(5)
  Time(minutes = 30, hours = 5)

  val time1 = Time(8, 40)
  val time2 = Time(8, 40)
  time1 == time2
  time2.minus(time1)
  time2 - time1 - 3
}