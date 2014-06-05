import sbt._

object Version {
  val scala     = "2.11.1"
  val scalaTest = "2.1.7"
}

object Library {
  val scalaTest = "org.scalatest" %% "scalatest" % Version.scalaTest
}

object Dependencies {

  import Library._

  val scalaInAction = List(
    scalaTest % "test"
  )
}
