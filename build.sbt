name := """PlayGrounded"""
organization := "de.brabandere.bartel"

version := "0.0.1"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.4"

libraryDependencies += guice

// Resolver is needed only for SNAPSHOT versions
resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

libraryDependencies ++= Seq(
  "com.adrianhurt" %% "play-bootstrap" % "1.4-P26-B4-SNAPSHOT"
)