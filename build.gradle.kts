group = "com.bcp.bank"
version = "1.0.1.lts"

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