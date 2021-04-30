package com.github.michnaadam33.phpstomrplugin.services

import com.github.michnaadam33.phpstomrplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
