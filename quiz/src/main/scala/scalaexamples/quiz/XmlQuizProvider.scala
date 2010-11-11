package scalaexamples.quiz

import xml._

/**
 * This class parses the xml from a file.
 */
class XmlQuizProvider(file: String) extends QuizProvider {

  def quiz = {
     val xmlFromFile = xml.XML.load(getClass.getClassLoader.getResourceAsStream(file))
     parseXml(xmlFromFile)
  } 
  
  private def parseXml(xml: Elem): Quiz = {
    val title = (xml \ "title").text
    val items = (xml \\ "item")
    val questions = items.map(parseElement)
    
    Quiz(title, questions.toList)
  }
  
  private def parseElement(node: NodeSeq) = {
    val text = (node \ "question").text
    val answers = (node \ "option").map(option => Answer(option.text, option.attribute("correct").map(_.text == "y").getOrElse(false)))
    Question(text, answers.toList)
  }
}
