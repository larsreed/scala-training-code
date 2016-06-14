package scalaexamples.traits

import junit.framework.Assert._
import org.junit.{Ignore, Test}
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

import scalaexamples.EmptyTest

@RunWith(classOf[JUnit4])
class DynamicMixinTest extends EmptyTest {

  @Test @Ignore
  def mixInTraitTest {
    val myElement = new Element(0)

    // Make the following compile and run.
    // Hint this is easy to achieve by mixing in the correct
    // trait right here when creating the instance of Element.

    // assertEquals("a value", myElement.mixedInMethod)
    val anotherElement = new Element(0) with MethodTrait
    assertEquals("another value", anotherElement.mixedInMethod)
  }


  @Test @Ignore
  def mixInInterfaceTest {
    // Make the following compile and run (uncomment the code)
    // Hint you can open the class or subclass it right here.

    // val myElement = new Element(0) with InterfaceTrait
    // assertNotNull(myElement.getSomeString)
  }


  @Test @Ignore
  def stackableTraitTest {
    // Make the following run without assertion error.
    // Hint: extend ElementWithStackableTrait with Element and SubClassTrait
    class ElementWithStackableTrait(value: Int)
    val element = new ElementWithStackableTrait(1)
    assertEquals("stacked toString, super toString is 'anIntValue is 1'", element.toString)
  }

}
