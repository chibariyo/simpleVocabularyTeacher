package controllers

import play.api.mvc._
import play.api.i18n.Lang

/**
 * Created by david on 17/02/15.
 */
class Import extends Controller {
  def importWord(
    sourceLanguage: Lang,
    word: String,
    targetLanguage: Lang,
    translation: String) = TODO

}
