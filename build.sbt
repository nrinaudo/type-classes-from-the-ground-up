enablePlugins(TutPlugin, GhpagesPlugin)

name         := "typeclasses-from-the-ground-up"
organization := "com.nrinaudo"
scalaVersion := "2.12.11"

val tutDirName = settingKey[String]("tut output directory")
tutDirName := "./"

addMappingsToSiteDir(tut, tutDirName)
SitePlugin.autoImport.makeSite / includeFilter :=
    "*.yml" | "*.md" | "*.html" | "*.css" | "*.png" | "*.jpg" | "*.gif" | "*.js" | "*.eot" | "*.svg" | "*.ttf" |
    "*.woff" | "*.woff2" | "*.otf"

git.remoteRepo := "git@github.com:nrinaudo/type-classes-from-the-ground-up.git"
