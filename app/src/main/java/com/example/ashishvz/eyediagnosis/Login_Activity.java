package com.example.ashishvz.eyediagnosis;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

public class Login_Activity extends Activity {
    ProgressBar progressBar;
    private static int SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
        progressBar= findViewById(R.id.pro);
        progressBar.setVisibility(View.VISIBLE);
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(Login_Activity.this,MainActivity.class);
            startActivity(intent);
            finish();
        },SPLASH_TIME_OUT);
    }
}
