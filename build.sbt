organization := "com.nrinaudo"
scalaVersion := "2.12.0"
tutSettings

siteSourceDirectory := tutTargetDirectory.value
makeSite := makeSite.dependsOn(tut).value

ghpages.settings
git.remoteRepo := "git@github.com:nrinaudo/talk-typeclasses-csv.git"
