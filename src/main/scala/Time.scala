class Time(val hours: Int, val minutes: Int) {

  def minus(that: Time): Int = this.asMinutes - that.asMinutes

  private def asMinutes = hours * 60 + minutes
}
