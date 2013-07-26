logLevel := Level.Warn

resolvers += Classpaths.typesafeResolver

resolvers += Resolver.url("bintray", new URL("http://dl.bintray.com/freekh/adept-ivy"))(Resolver.ivyStylePatterns)

addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.1.4")

addSbtPlugin( "com.typesafe.sbtscalariform" % "sbtscalariform" % "0.5.1") 

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.1.0")

addSbtPlugin("org.adept" % "adept-sbt" % "0.8.0-RC1")

