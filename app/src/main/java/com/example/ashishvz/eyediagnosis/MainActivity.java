package com.example.ashishvz.eyediagnosis;

import android.app.Activity;
import android.content.Intent;
import android.support.design.card.MaterialCardView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    CardView c1,c2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"WelCome To Eye Diagnosis Service!!",Toast.LENGTH_SHORT).show();
        c1=findViewById(R.id.gallerycard);
        c2=findViewById(R.id.cameracard);

        c1.setOnClickListener(v -> {
        Intent intent = new Intent(MainActivity.this,ClassifierActivity.class);
        startActivity(intent);
        });

        c2.setOnClickListener(v -> {
            Intent intent =new Intent(MainActivity.this,CameraActivity.class);
            startActivity(intent);
        });
    }
}
