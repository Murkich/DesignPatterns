package com.dnoviy.creational.abstractfactory;

import com.dnoviy.creational.abstractfactory.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getManager();

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
