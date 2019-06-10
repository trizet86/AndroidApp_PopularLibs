package ru.nbdev.popularlibs.di.withDi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ru.nbdev.popularlibs.R;

public class DiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_di);

        Green green = new Green();
        Red red = new Red(green);
        White white = new White(green);
    }
}
