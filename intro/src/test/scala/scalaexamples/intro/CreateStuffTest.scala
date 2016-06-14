package scalaexamples.intro

import junit.framework.Assert._
import org.junit.{Ignore, Test}
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

import scalaexamples.EmptyTest

@RunWith(classOf[JUnit4])
class CreateStuffTest extends EmptyTest {

  val stuff = new Stuff

  @Test @Ignore
  def accessOverridenToString {
    assertEquals("Stuff", stuff.toString)
  }

  @Test @Ignore
  def accessVal {
    // Make this compile and run

  	// assertEquals("This is a constant", stuff.const)

    // When commenting in the following line, you must get a compile error
  	// stuff.const = "Must give compile error"
  }

  @Test @Ignore
  def changeVar {
    // Make this compile and run

    // assertEquals("This is a variable", stuff.variable)
    val text = "Changed it"
    // stuff.variable = text
    // assertEquals(text, stuff.variable)
    ()
  }

  @Test @Ignore
  def accessStuffObject {
    // Make this compile and run

    //assertEquals("StuffObject", Stuff.getString)
  }

  @Test @Ignore
  def testSayHello {
    // Make this compile and run

    // assertEquals("Hello Alf", stuff.sayHello("Alf"))
  }

  @Test @Ignore
  def testPrintHello {
    // Make this compile and run

    // assertEquals((), stuff.printHello("Alf"))
  }

}
