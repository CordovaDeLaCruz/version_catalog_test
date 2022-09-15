group = "com.bcp.bank"
version = "defined-by-git-tag"

plugins {
    `version-catalog`
    `maven-publish`
}

/// order of the files matter: lower index overrides definitions on later entries
val featureFiles = listOf(
    "dependencies/MBBKST-Maps/mbbkst-maps.toml",
)
val defaultFiles = listOf(
    "dependencies/settings/mbbk.plugins.settings.toml",
    "dependencies/settings/mbbk.bundles.settings.toml",
    "dependencies/settings/mbbk.libraries.settings.toml",
    "dependencies/settings/mbbk.versions.settings.toml",
//    "dependencies/core/mbbk.versions.core.toml",
//    "dependencies/core/mbbk.libraries.core.toml",
)

catalog {
    versionCatalog {
        from(files(
            listOf(featureFiles, defaultFiles).flatten()
        ))
    }
}

publishing {
    publications {
        create<MavenPublication>("mbbk") {
             from(components["versionCatalog"])
        }
    }
}