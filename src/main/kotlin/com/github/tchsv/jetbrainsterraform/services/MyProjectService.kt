package com.github.tchsv.jetbrainsterraform.services

import com.intellij.openapi.project.Project
import com.github.tchsv.jetbrainsterraform.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
