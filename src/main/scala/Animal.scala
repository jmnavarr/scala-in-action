class Bird {
  def fly = "I can fly"
}

trait Swimmer {
  def swim = "I can swim"
}

class Fish extends Swimmer

class Duck extends Bird with Swimmer
