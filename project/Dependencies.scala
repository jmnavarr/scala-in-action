import sbt._

object Version {
  val scala     = "2.11.0-RC4"
  val scalaTest = "2.1.3"
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
