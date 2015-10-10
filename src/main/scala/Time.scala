case class Time(hours: Int = 0, minutes: Int = 0) {

  def minus(that: Time): Int = this.asMinutes - that.asMinutes

  def -(that: Time): Int = minus(that)

  override def toString = f"$hours%02d:$minutes%02d"

  private def asMinutes = hours * 60 + minutes
}
