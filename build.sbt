lazy val scalaInAction = project in file(".")

name := "scala-in-action"

Common.settings

libraryDependencies ++= Dependencies.scalaInAction

initialCommands := """|import de.heikoseeberger.scalainaction._""".stripMargin
