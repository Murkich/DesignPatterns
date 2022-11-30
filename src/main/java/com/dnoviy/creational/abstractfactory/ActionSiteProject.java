package com.dnoviy.creational.abstractfactory;

import com.dnoviy.creational.abstractfactory.website.WebSiteTeamFactory;

public class ActionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getManager();

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
