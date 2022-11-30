package com.dnoviy.structural.composite;

public class File {
    private String name;
    private String extension;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public File() {
    }

    public File(String name) {
        this.name = name;
    }
}
