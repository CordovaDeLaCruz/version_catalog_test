import org.gradle.api.internal.catalog.parser.TomlCatalogFileParser
import kotlin.io.path.Path

group = "com.bcp.bank"
version = "defined-by-git-tag"

plugins {
    `version-catalog`
    `maven-publish`
}

/// order of the files matter: lower index overrides definitions on later entries
val defaultFiles = listOf(
        "dependencies/settings/mbbk.versions.settings.toml",
        "dependencies/settings/mbbk.plugins.settings.toml",
        "dependencies/settings/mbbk.bundles.settings.toml",
        "dependencies/settings/mbbk.libraries.settings.toml",

        "dependencies/core/mbbk.versions.core.toml",
        "dependencies/core/mbbk.libraries.core.toml",
)

catalog {
    versionCatalog {
        defaultFiles.forEach {
            val filePath = file(it).path
            TomlCatalogFileParser.parse(Path(filePath), this)
        }
    }
}

publishing {
    publications {
        create<MavenPublication>("mbbk") {
            from(components["versionCatalog"])
        }
    }
}

tasks.create<Delete>("clean") {
    delete(rootProject.buildDir)
}