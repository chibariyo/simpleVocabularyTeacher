package models

import play.api.i18n.Lang

/**
 * Created by david on 17/02/15.
 */
case class Vocabulary(sourceLanguage: Lang, targetLanguage: Lang, word: String, translation: String)