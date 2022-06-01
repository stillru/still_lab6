package com.rgsu_labs.still_lab6;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ProgramTest programTest = new ProgramTest();
    private TextView text1;
    private TextView text2;
    private Spinner programSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = findViewById(R.id.textView);
        text2 = findViewById(R.id.textView2);
        programSpinner = findViewById(R.id.program);
        programTest.makeListProgram();
    }

    public void onButton1Click(View view) {
        //Получить вариант, выбранный в Spinner
        String programGenre = String.valueOf(programSpinner.getSelectedItem());
        text1.setText(programTest.getNameFilmsByGenre(programGenre));
        text2.setText(programTest.getNameFilmsByYear(programGenre).toString());
    }
}

