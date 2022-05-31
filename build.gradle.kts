group = "com.bcp.bank"
version = "1.0-SNAPSHOT"

plugins {
    `version-catalog`
    `maven-publish`
}

catalog {
    versionCatalog {
        from(files("mbbk.versions.toml"))
    }
}

publishing {
    publications {
        create<MavenPublication>("mbbk") {
             from(components["versionCatalog"])
        }
    }
}