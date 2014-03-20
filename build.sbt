lazy val scalaInAction = Project(
  "scala-in-action",
  file("."),
  settings =
    Common.settings ++ 
    List(
      libraryDependencies ++= Dependencies.scalaInAction
    )
)
