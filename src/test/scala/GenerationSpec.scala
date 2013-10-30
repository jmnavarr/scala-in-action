import org.scalatest.{ Matchers, WordSpec }

class GenerationSpec extends WordSpec with Matchers {

  "Calling next" should {
    "return an empty Generation for a empty Generation" in {
      Generation().next shouldEqual Generation()
    }
    "return a Generation with a horizontal triple for a Generation with a vertical triple" in {
      Generation(horizontalTriple).next shouldEqual Generation(verticalTriple)
    }
    "return a Generation with a vertical triple for a Generation with a horizontal triple" in {
      Generation(verticalTriple).next shouldEqual Generation(horizontalTriple)
    }
  }

  val horizontalTriple = Set(Cell(-1, 0), Cell(0, 0), Cell(1, 0))

  val verticalTriple = Set(Cell(0, -1), Cell(0, 0), Cell(0, 1))
}
