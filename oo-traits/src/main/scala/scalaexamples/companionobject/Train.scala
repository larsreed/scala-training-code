package scalaexamples.companionobject

// Define a primary constructor which takes a list of passengers (String) and an Option conductor also String
class Train(val passengers: List[String], val conductor:Option[String]) {

  // You should also define an auxiliary constructor, which ignores the conductor
  def this(passengers: List[String]) = {
    this(passengers, None)
  }
}

object Train {
  
  // make a method which makes Train(Array("Alf", "Fredrik")) compile
  def apply(passengers: Array[String]) = new Train(passengers.toList)

  // make a method which makes Train("Alf", "Fredrik") compile
  def apply(names: String*) = new Train(names.toList)

  // make a method which makes Train(Some("Conductor"), "Alf", "Fredrik") compile
  def apply(conductor: Option[String], names: String*) = new Train(names.toList, conductor)
}
