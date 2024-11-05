lazy val compression = Project("compression", file("."))
scalaVersion := "3.4.2"
name         := "compression"
organization := "org.lichess"
version      := "2.0"
resolvers += "lila-maven" at "https://raw.githubusercontent.com/ornicar/lila-maven/master"
libraryDependencies += "org.specs2" %% "specs2-core" % "4.17.0" % Test
scalacOptions := Seq(
  "-encoding",
  "utf-8",
  "-explaintypes",
  "-feature",
  "-language:postfixOps",
  "-indent",
  "-rewrite",
  "-source:future-migration",
  "-release:21"
)
publishTo := Some(Resolver.file("file", new File(sys.props.getOrElse("publishTo", ""))))
