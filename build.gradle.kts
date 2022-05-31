group = "com.bcp.bank"
version = "1.0-SNAPSHOT"

plugins {
    `version-catalog`
    `maven-publish`
}

catalog {
    versionCatalog {
        // create("mbbk") {
            from(files("mbbk.versions.toml"))
        // }
        // library("my-lib", "com.mycompany:mylib:1.2")
    }
}

publishing {
    publications {
        create<MavenPublication>("mbbk") {
            // println("Version Catalogs:")
            // versionCatalogs.catalogNames.forEach { println(it) }
            // println("-----------")
            // println(versionCatalogs)
            // println("-----------")
             from(components["versionCatalog"])
            // from(versionCatalogs)
        }
    }
}