package com.dnoviy.creational.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("heeey first");
        ProgramLogger.getProgramLogger().addLogInfo("heeey second");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}
