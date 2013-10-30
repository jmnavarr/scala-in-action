import org.scalatest.{ Matchers, WordSpec }

class CellSpec extends WordSpec with Matchers {

  "Calling neighbors" should {
    "return the surrounding Cells" in {
      Cell(0, 0).neighbors shouldEqual Set(
        Cell(-1, -1), Cell(0, -1), Cell(1, -1),
        Cell(-1, 0), Cell(1, 0),
        Cell(-1, 1), Cell(0, 1), Cell(1, 1)
      )
    }
  }
}
