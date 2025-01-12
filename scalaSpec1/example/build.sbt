course := "progfun1"
assignment := "example"
scalaVersion := "3.3.0"
scalacOptions ++= Seq("-language:implicitConversions", "-deprecation")
libraryDependencies += "org.scalameta" %% "munit" % "0.7.26" % Test

resolvers += "GitHub Packages" at "https://maven.pkg.github.com/ajit.bharadwaja@gmail.com/scala-functional-programming.git"

