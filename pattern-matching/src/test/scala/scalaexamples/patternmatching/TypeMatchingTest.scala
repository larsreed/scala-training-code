package scalaexamples.patternmatching

import junit.framework.Assert._
import org.junit.{Ignore, Test}
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

import scalaexamples.EmptyTest

@RunWith(classOf[JUnit4])
class TypeMatchingTest extends EmptyTest {

	@Test @Ignore
  def matchOnType {
	val elements = List(23, "Hello", 8.5, 'q')
	for (element <- elements) {
	  element match {
	    // Make test run, and assert on types, e.g. " => assertEquals(23, integer)" or " => assertEquals("Hello", s)"
	    // Insert your matching code here
	    case other => sys.error("Should match other on type")
	 }
	}
  }

}
