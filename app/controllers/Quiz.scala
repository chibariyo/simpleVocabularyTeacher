package controllers

import javax.inject.Inject

import play.api.i18n.Lang
import play.api.mvc.{ Action, Controller }
import services.VocabularyService

/**
 * Created by david on 17/02/15.
 */
class Quiz @Inject() (vocabulary: VocabularyService) extends Controller {
  def quiz(sourceLanguage: Lang, targetLanguage: Lang) = Action { request =>
    vocabulary.findRandomVocabulary(sourceLanguage, targetLanguage).map { v =>
      Ok(v.word)
    } getOrElse {
      NotFound
    }
  }

  def check(sourceLanguage: Lang, word: String, targetLanguage: Lang, translation: String) = Action { request =>
    val isCorrect = vocabulary.verify(sourceLanguage, word, targetLanguage, translation)
    if (isCorrect) {
      Ok
    } else {
      NotAcceptable
    }
  }
}
