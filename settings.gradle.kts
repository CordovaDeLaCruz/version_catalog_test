rootProject.name = "gradle-version-catalogs"

enableFeaturePreview("VERSION_CATALOGS")

dependencyResolutionManagement {
    versionCatalogs {
        create("mbbk") {
            from(files("mbbk.versions.toml"))
        }
    }
}
