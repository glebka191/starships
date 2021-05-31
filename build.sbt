name := "StarshipWorkshop"

version := "0.1"

scalaVersion := "2.12.8"

val Version = new {
  val akka = "2.6.14"
  val akkaHttp = "10.2.4"
  val akkaActorTyped = "2.6.14"
  val sprayJSON = "1.3.5"
  val akkaHttpSprayJSON = "10.2.4"
}

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream" % Version.akka,
  "com.typesafe.akka" %% "akka-http" % Version.akkaHttp,
  "com.typesafe.akka" %% "akka-actor-typed" % Version.akkaActorTyped,
  "com.typesafe.akka" %% "akka-http-spray-json" % Version.akkaHttpSprayJSON,
  "io.spray" %% "spray-json" % Version.sprayJSON,
  "com.typesafe.akka" %% "akka-http-testkit" % Version.akkaHttp % Test,
  "com.typesafe.akka" %% "akka-stream-testkit" % Version.akka % Test,
  "org.scalatest" %% "scalatest" % "3.0.5" % Test,
  "com.softwaremill.sttp" %% "core" % "1.5.12" % Test
)