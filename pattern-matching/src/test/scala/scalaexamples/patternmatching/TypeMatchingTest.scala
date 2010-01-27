package scalaexamples.patternmatching

import junit.framework.Assert._
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import scalaexamples.EmptyTest

@RunWith(classOf[JUnit4])
class TypeMatchingTest extends EmptyTest {

  @Test
  def matchOnType {
    val elements = List(23, "Hello", 8.5, 'q')
    for (element <- elements) {
      element match {
        // Make test run, and assert on types, e.g. " => assertEquals(23, integer)" or " => assertEquals("Hello", s)"
        // Insert your matching code here
        case integer:Int => assertEquals(23, integer)
        case d:Double => assertEquals(8.5, d)
        case s:String => assertEquals("Hello", s)
        case c:Character => assertEquals('q', c)
        case other => error("Should match other on type" + other)
      }
    }
  }

}
