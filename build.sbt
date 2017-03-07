lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := "play-scala",
    version := "1.0-SNAPSHOT",

    scalaVersion := "2.12.1",
    libraryDependencies ++= Seq(
      guice,
      "org.scalatest" %% "scalatest" % "3.0.1" % Test,
      "org.scalatestplus.play" %% "scalatestplus-play" % "2.0.0-M2" % Test
    )
  )
