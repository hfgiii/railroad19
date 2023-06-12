name := "railroad19"

version := "0.1"

scalaVersion := "2.13.7"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.16" % "test",
  "org.scalamock" %% "scalamock" % "5.2.0" % "test",
  "org.scalatestplus" %% "scalacheck-1-17" % "3.2.16.0" % "test"
)

scalacOptions ++= Seq(
  "-language:higherKinds"
)
