case class Time(hours: Int = 0, minutes: Int = 0) {

  def minus(that: Time): Int = this.asMinutes - that.asMinutes

  def -(that: Time): Int = minus(that)

  private def asMinutes = hours * 60 + minutes
}
