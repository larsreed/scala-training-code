package scalaexamples.inheritance

import Math.Pi

// Make Circle extend Shape, and add a primary constructor for radius and color
class Circle(val radius: Double, color: String) extends Shape(color) {

  // Create a auxiliary constructor
  def this(radius:Double) = this(radius, Shape.DefaultColor)
  
  // Define the area function
  def area = Pi * radius * radius
  
  // Make this compile
  def circumference = 2 * Pi * radius
  
}
