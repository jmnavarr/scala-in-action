import java.io.FileInputStream
import scala.io.Source

object AutomatedResourceManagement {

  type Closable = {
    def close(): Unit
  }

  def withResource[A <: Closable, B](a: A)(f: A => B): B = try f(a) finally a.close()

  def main(args: Array[String]): Unit = {
    val contents = withResource(new FileInputStream("build.sbt")) { in =>
      Source.fromInputStream(in).getLines().mkString(f"%n")
    }
    println(s"""|```
                |$contents
                |```""".stripMargin)
  }
}
