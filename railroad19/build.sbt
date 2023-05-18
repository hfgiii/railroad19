name := "railroad19"

version := "0.1"

scalaVersion := "2.13.7"

//val catsVersion = "2.7.0"

//libraryDependencies ++= Seq(
//  "org.typelevel" %% "cats-core" % catsVersion,
//)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.16" % "test"
)

scalacOptions ++= Seq(
  "-language:higherKinds"
)
