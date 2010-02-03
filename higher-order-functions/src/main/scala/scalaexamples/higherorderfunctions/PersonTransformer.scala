package scalaexamples.higherorderfunctions

class PersonTransformer {

  // Implement the method transformPersons that takes in
  // a list of persons and a function from Person to another type A,
  // applies the function to each Person and
  // returns a new list containing the results of applying the function to each person
  
  def transformPersons[A](persons: List[Person], f: Person => A): List[A] = {
    persons match {
      case p :: rest => f(p) :: transformPersons(rest, f)
      case _ => Nil
    }
  }
  
}
