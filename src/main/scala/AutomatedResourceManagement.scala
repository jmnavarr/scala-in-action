import java.io.FileInputStream
import scala.io.Source

object AutomatedResourceManagement {

  def main(args: Array[String]): Unit = {
    val in = new FileInputStream("build.sbt")
    val contents = Source.fromInputStream(in).getLines().mkString(f"%n")
    println(s"""|```
                |$contents
                |```""".stripMargin)
  }
}
