package net.siguremon

import org.gradle.api.Plugin
import org.gradle.api.Project

class CustomPlugin implements Plugin<Project> {
  void apply(Project project) {
    project.task('custom') << {
      println "hi from custom plugin"
    }
  }
}