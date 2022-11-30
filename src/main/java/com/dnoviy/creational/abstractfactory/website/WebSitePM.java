package com.dnoviy.creational.abstractfactory.website;

import com.dnoviy.creational.abstractfactory.ProjectManager;

public class WebSitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("WebSitePM manages project");
    }
}
