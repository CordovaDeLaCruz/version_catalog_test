/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.bcp.bank.version.catalog

import org.gradle.testfixtures.ProjectBuilder
import kotlin.test.Test
import kotlin.test.assertNotNull

/**
 * A simple unit test for the 'com.bcp.bank.version.catalog.greeting' plugin.
 */
class VersionCatalogPluginPluginTest {
    @Test fun `plugin registers task`() {
        // Create a test project and apply the plugin
        val project = ProjectBuilder.builder().build()
        project.plugins.apply("com.bcp.bank.version.catalog.greeting")

        // Verify the result
        assertNotNull(project.tasks.findByName("greeting"))
    }
}
