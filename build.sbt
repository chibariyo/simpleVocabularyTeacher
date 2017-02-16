name := """simpleVocabularyTeacher"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2 % Test
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

// The default settings for the scalariform code formatting tool
com.typesafe.sbt.SbtScalariform.scalariformSettings

// Add path and query string binders
routesImport += "binders.PathBinders._"
routesImport += "binders.QueryStringBinders._"

// add filters
libraryDependencies += filters