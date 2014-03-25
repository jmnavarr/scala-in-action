import java.io.FileInputStream
import scala.io.Source

object AutomatedResourceManagement {

  def main(args: Array[String]): Unit = {
    val in = new FileInputStream("build.sbt")
    val lineCount =
      try
        Source.fromInputStream(in).getLines().size
      finally
        in.close() // Don't forget to close!
    println(lineCount)
  }
}
