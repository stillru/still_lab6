package com.rgsu_labs.still_lab6;

import java.util.ArrayList;
import java.util.List;

public class ProgramTest {
    List<Program> lstProgram = new ArrayList<>();

    public void makeListProgram() {
        lstProgram.clear();
        lstProgram.add(new Program("IDE", "Android Studio", 2000));
        lstProgram.add(new Program("BD", "Oracle", 2000));
        lstProgram.add(new Program("Program Language", "Lua", 1991));
        lstProgram.add(new Program("Architecture", "x86", 1984));
        lstProgram.add(new Program("UNIX Type", "GNU", 1992));
        lstProgram.add(new Program("OS", "Ubuntu", 1999));
        lstProgram.add(new Program("Text Editor", "Emacs", 1984));
    }

    public String getNameFilmsByGenre(String type) {
        StringBuilder s = new StringBuilder();
        for (Program program : lstProgram) {
            if (program.getType().equals(type)) {
                s.append(program.getNameProgram()).append("\n");
            }
        }
        return s.toString();
    }

    public Object getNameFilmsByYear(String type) {
        StringBuilder s = new StringBuilder();
        for (Program program : lstProgram) {
            if (program.getType().equals(type)) {
                s.append(program.getYearProgram()).append("\n");
            }
        }
        return s.toString();
    }
}
