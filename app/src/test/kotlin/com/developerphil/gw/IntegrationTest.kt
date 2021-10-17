/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.developerphil.gw

import assertk.assertThat
import assertk.assertions.isEqualTo
import com.developerphil.gw.TestData.unixFileSystem
import org.junit.Test

class IntegrationTest {

    @Test
    fun `can run a simple command`() {
        val app = App(arrayOf("clean assemble"), unixFileSystem(workingDirectory = "/project"))

        assertThat(app.run()).isEqualTo("./gradlew clean assemble")
    }

    @org.junit.Test
    fun `can run a simple command from a different folder`() {
        val app = App(arrayOf("clean assemble"), unixFileSystem(workingDirectory = "/project/project_a/feature/login"))

        assertThat(app.run()).isEqualTo("../../gradlew clean assemble")
    }
}

