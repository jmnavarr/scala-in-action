import com.typesafe.sbt.SbtScalariform._
import sbt._
import sbt.Keys._
import scalariform.formatter.preferences._

object Common {

  val settings = 
    Project.defaultSettings ++
    scalariformSettings ++
    List(
      // Core settings
      organization := "name.heikoseeberger",
      version := "2.0.0",
      scalaVersion := Version.scala,
      crossScalaVersions := List(scalaVersion.value),
      scalacOptions ++= List(
        "-unchecked",
        "-deprecation",
        "-language:_",
        "-target:jvm-1.7",
        "-encoding", "UTF-8"
      ),
      fork in run := true,
      // Scalariform settings
      ScalariformKeys.preferences := ScalariformKeys.preferences.value
        .setPreference(AlignSingleLineCaseStatements, true)
        .setPreference(DoubleIndentClassDeclaration, true)
        .setPreference(PreserveDanglingCloseParenthesis, true)
    )
}
