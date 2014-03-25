import java.io.FileInputStream
import scala.io.Source

object AutomatedResourceManagement {

  type Closable = {
    def close(): Unit
  }

  def withResource[A <: Closable, B](resource: A)(f: A => B): B =
    try f(resource) finally resource.close()

  def main(args: Array[String]): Unit = {
    val in = new FileInputStream("build.sbt")
    val lineCount =
      withResource(in) { resource =>
        Source.fromInputStream(resource).getLines().size
      }
    println(lineCount)
  }
}
