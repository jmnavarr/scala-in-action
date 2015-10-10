case class Time(hours: Int, minutes: Int) {

  def minus(that: Time): Int = this.asMinutes - that.asMinutes

  private def asMinutes = hours * 60 + minutes
}
