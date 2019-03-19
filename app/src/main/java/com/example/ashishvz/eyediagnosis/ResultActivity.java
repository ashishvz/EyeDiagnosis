package com.example.ashishvz.eyediagnosis;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends Activity {
    public  TextView resulttext;
    public String string;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
         resulttext=findViewById(R.id.resulttext);


    }
}
