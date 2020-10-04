package com.example.profilehandle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.profilehandle.Categories.showusercategory;
import com.example.profilehandle.ProfileHandle.login;
import com.example.profilehandle.Register.register_1;

public class dashboard extends AppCompatActivity {

    CardView dreg,dlog,dhome,dads,dfeed,dadmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dashboard);

        dreg = findViewById(R.id.dreg);
        dlog = findViewById(R.id.dlog);
        dhome = findViewById(R.id.dhome);
        dads = findViewById(R.id.dads);
        dfeed = findViewById(R.id.dfeed);

        dreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard.this, register_1.class);
                startActivity(intent);
            }
        });

        dlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard.this, login.class);
                startActivity(intent);
            }
        });

        dhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(dashboard.this, showusercategory.class);
               startActivity(intent);
            }
        });

        dads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent = new Intent(dashboard.this, register_1.class);
                // startActivity(intent);
            }
        });

        dfeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  Intent intent = new Intent(dashboard.this, register_1.class);
              //  startActivity(intent);
            }
        });


    }
}