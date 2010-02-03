package scalaexamples.inheritance

// Subclass the Rectangle
class Square(val side: Double, color: String) extends Rectangle(side, side, color){
  
  // Create an auxiliary constructor
  def this(side:Double) = this(side, Shape.DefaultColor)

  // Override the area method
  override def area = side * side
}
