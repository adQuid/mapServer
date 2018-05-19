name := """play-java-rest-api-example"""

version := "2.6.x"

inThisBuild(
  List(
    scalaVersion := "2.12.4",
    crossScalaVersions := Seq("2.11.12", "2.12.4"),
    dependencyOverrides := Seq(
       "org.codehaus.plexus" % "plexus-utils" % "3.0.18",
       "com.google.code.findbugs" % "jsr305" % "3.0.1",
       "com.google.guava" % "guava" % "22.0"
    )
  )
)

lazy val root = (project in file(".")).enablePlugins(PlayJava)

libraryDependencies += guice
libraryDependencies += javaJpa
libraryDependencies += "com.h2database" % "h2" % "1.4.196"

libraryDependencies += "org.hibernate" % "hibernate-core" % "5.2.9.Final"
libraryDependencies += "io.dropwizard.metrics" % "metrics-core" % "3.2.1"
libraryDependencies += "com.palominolabs.http" % "url-builder" % "1.1.0"
libraryDependencies += "net.jodah" % "failsafe" % "1.0.3"


PlayKeys.externalizeResources := false

testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))
