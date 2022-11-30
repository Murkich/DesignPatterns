package com.dnoviy.creational.abstractfactory.banking;

import com.dnoviy.creational.abstractfactory.Developer;
import com.dnoviy.creational.abstractfactory.ProjectManager;
import com.dnoviy.creational.abstractfactory.ProjectTeamFactory;
import com.dnoviy.creational.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getManager() {
        return new BankingPM();
    }
}
