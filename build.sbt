name := "$name$"
version := "1.0.0"

scalaVersion := "3.7.1"

scalacOptions ++= Seq(
   "-deprecation",         // Emit warning and location for usages of deprecated APIs.
   "-explain",             // Explain errors in more detail.
   "-feature",             // Emit warning and location for usages of features that should be imported explicitly.
   "-print-lines",         // Show source code line numbers.
   "-unchecked",           // Enable additional warnings where generated code depends on assumptions
   "-Xfatal-warnings",     // Fail the compilation if there are any warnings.
   "-source:3.3",
   "-encoding", "utf8",
)

libraryDependencies ++= {
    val pekkoVersion = "1.1.4"
    val pekkoHttpVersion = "1.2.0"
    Seq(
        "org.apache.pekko" %% "pekko-http"                % pekkoHttpVersion,
        "org.apache.pekko" %% "pekko-http-spray-json"     % pekkoHttpVersion,
        "org.apache.pekko" %% "pekko-actor-typed"         % pekkoVersion,
        "org.apache.pekko" %% "pekko-stream"              % pekkoVersion,
        "ch.qos.logback"    % "logback-classic"           % "1.5.18",

        "org.apache.pekko" %% "pekko-http-testkit"        % pekkoHttpVersion % Test,
        "org.apache.pekko" %% "pekko-actor-testkit-typed" % pekkoVersion     % Test,
        "org.scalatest"     %% "scalatest"                % "3.2.19"         % Test
    )
}