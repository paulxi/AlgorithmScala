import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.paul",
      scalaVersion := "2.12.6",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "AlgorithmScala",
    libraryDependencies ++= Seq(
      scalaTest % Test,
      scalaCheck % Test
    )
  )

//name := "AlgorithmScala"
//
//version := "0.1.0-SNAPSHOT"
//
//scalaVersion := "2.12.6"
//
//scalacOptions ++= Seq("-deprecation", "-feature")
//
//libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.3" % "test"
