package com.dnoviy.creational.abstractfactory.banking;

import com.dnoviy.creational.abstractfactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("BankingPM manages project");
    }
}
