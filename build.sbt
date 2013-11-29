name := "tareas"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
	jdbc,
	"postgresql" % "postgresql" % "9.1-901.jdbc4",
	anorm
)

play.Project.playJavaSettings
