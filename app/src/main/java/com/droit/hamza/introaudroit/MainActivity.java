package com.droit.hamza.introaudroit;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
public void droitObjectif(View view){

    Intent i = new Intent(MainActivity.this,droitObjectifAc.class);
    startActivity(i);
}
public void droitSubjectif(View view){

        Intent i = new Intent(MainActivity.this,droitSubjectifAc.class);
        startActivity(i);

    }
}
