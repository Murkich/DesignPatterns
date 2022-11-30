package com.dnoviy.creational.abstractfactory.website;

import com.dnoviy.creational.abstractfactory.Developer;
import com.dnoviy.creational.abstractfactory.ProjectManager;
import com.dnoviy.creational.abstractfactory.ProjectTeamFactory;
import com.dnoviy.creational.abstractfactory.Tester;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PHPDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getManager() {
        return new WebSitePM();
    }
}
