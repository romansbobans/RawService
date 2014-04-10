import play.Project._

name := "DownloadService"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
"org.mongodb" % "mongo-java-driver" % "2.8.0",
  javaJdbc,
  javaEbean,
  cache
)

resolvers += "snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

resolvers += "releases"  at "https://oss.sonatype.org/content/groups/scala-tools"

play.Project.playJavaSettings
