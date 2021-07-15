package com.github.zhaoyuan1234dj.tem.services

import com.github.zhaoyuan1234dj.tem.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
