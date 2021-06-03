import com.soywiz.korge.gradle.*

buildscript {
	val korgePluginVersion: String by project

	repositories {
		mavenLocal()
		mavenCentral()
		google()
		maven { url = uri("https://plugins.gradle.org/m2/") }
	}
	dependencies {
		classpath("com.soywiz.korlibs.korge.plugins:korge-gradle-plugin:$korgePluginVersion")
	}
}

apply<KorgeGradlePlugin>()

korge {
	id = "de.tfr.example.game.tree"
	name = "The Tree"
	// To enable all targets at once

	//targetAll()

	// To enable targets based on properties/environment variables
	//targetDefault()

	// To selectively enable targets

	targetJvm()
	targetJs()
	targetDesktop()
	//targetIos()
	targetAndroidIndirect() // targetAndroidDirect()
}