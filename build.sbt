val commonSettings = Seq(
  scalaVersion := "2.11.8")


lazy val root =
  Project(id = "fpinscala", base = file("."))
      .aggregate (chapterCode, exercises, answers)
      .settings(commonSettings: _*)
lazy val chapterCode =
  Project(id = "chapter-code",
    base = file("chaptercode"))
    .settings(commonSettings: _*)
lazy val exercises =
  Project(id = "exercises",
    base = file("exercises"))
    .settings(commonSettings: _*)
lazy val answers =
  Project(id = "answers",
    base = file("answers"))
    .settings(commonSettings: _*)

