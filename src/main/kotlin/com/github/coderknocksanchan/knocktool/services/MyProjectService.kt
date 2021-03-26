package com.github.coderknocksanchan.knocktool.services

import com.github.coderknocksanchan.knocktool.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
