package com.rgsu_labs.still_lab6;

public class Program {
    private final String type;
    private final String nameProgram;
    private final int yearProgram;

    public Program(String type, String nameProgram, int yearProgram) {
        this.type = type;
        this.nameProgram = nameProgram;
        this.yearProgram = yearProgram;
    }

    public String getNameProgram() {
        return nameProgram;
    }

    public String getType() {
        return type;
    }

    public int getYearProgram() {
        return yearProgram;
    }
}
