package com.jd.scala

object CaseClasses {

  abstract class Notification
  case class Email(sourceEmail: String, title: String, body: String) extends Notification
  case class SMS(sourceNumber: String, message: String) extends Notification
  case class VoiceRecording(contactName: String, link: String) extends Notification

  def showNotification(notification: Notification): String = {
    notification match {
      case Email(email, title, _) =>
        "You got an email from " + email + " with title: " + title
      case SMS(number, message) =>
        "You got an SMS from " + number + "! Message: " + message
      case VoiceRecording(name, link) =>
        "you received a Voice Recording from " + name + "! Click the link to hear it: " + link
    }
  }

  def main(args: Array[String]): Unit = {
    val emailFromJohn = Email("john.doe@mail.com", "Greetings From John!", "Hello World!")
    val title = emailFromJohn.title
    println(title) // prints "Greetings From John!"

    val someSms = SMS("12345", "Are you there?")
    val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")
    println(showNotification(someSms))
    println(showNotification(someVoiceRecording))
  }
}
