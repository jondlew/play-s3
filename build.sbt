
//val playVersion = "2.7.0"


githubOwner := "jondlew"
githubRepository := "play-s3"
githubTokenSource := TokenSource.GitConfig("github.token")
publishMavenStyle := true

lazy val root = (project in file("."))
  .settings(
    name := "play-s3",
    organization := "com.newwavecoding",
    organizationName := "newwavecoding",
    scalaVersion := "2.13.12",
    version := "1.0.0",
    libraryDependencies ++= Seq(
        "org.scala-lang.modules" %% "scala-xml" % "2.2.0" % "provided",
        "org.playframework" %% "play-ws" % "3.0.0" % "provided",
        "org.playframework" %% "play-ahc-ws-standalone" % "3.0.0" % "provided",
        "commons-codec" % "commons-codec" % "1.16.0" % "provided",
    )
  )
 // .settings(bintraySettings: _*)

//lazy val bintraySettings = Seq(
//  licenses += ("MIT", url("http://opensource.org/licenses/MIT")),
//  homepage := Some(url("https://github.com/kaliber-scala/play-s3")),
//  bintrayOrganization := Some("kaliber-scala"),
//  bintrayReleaseOnPublish := false,
//  publishMavenStyle := true,
// // crossScalaVersions := Seq("2.12.2", "2.11.6"),
// // releaseCrossBuild := true,
//
//  pomExtra := (
//    <scm>
//      <connection>scm:git@github.com:kaliber-scala/play-s3.git</connection>
//      <developerConnection>scm:git@github.com:kaliber-scala/play-s3.git</developerConnection>
//      <url>https://github.com/kaliber-scala/play-s3</url>
//    </scm>
//    <developers>
//      <developer>
//        <id>Kaliber</id>
//        <name>Kaliber Interactive</name>
//        <url>https://kaliber.net/</url>
//      </developer>
//    </developers>
//    )
//)

scalacOptions ++= Seq("-feature", "-deprecation")

//parallelExecution in Test := false

//releaseIgnoreUntrackedFiles := true

// Release
//import ReleaseTransformations._
//releasePublishArtifactsAction := PgpKeys.publishSigned.value
//releaseProcess := Seq[ReleaseStep](
//  checkSnapshotDependencies,
//  inquireVersions,
//  runClean,
//  runTest,
//  setReleaseVersion,
//  commitReleaseVersion,
//  tagRelease,
//  publishArtifacts,
//  releaseStepTask(bintrayRelease in root),
//  setNextVersion,
//  commitNextVersion,
//  pushChanges
//)
