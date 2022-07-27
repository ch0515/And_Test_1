package com.cookandroid.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
Button btn_Ok;
RadioGroup group;
ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_Ok = findViewById(R.id.btn_Ok);
        group = findViewById(R.id.group);
        img = findViewById(R.id.img);
        btn_Ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                group.setVisibility(View.VISIBLE);
                img.setVisibility(View.VISIBLE);
            }
        });
        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rabtn1:
                        img.setImageResource(R.drawable.img1);
                        break;
                    case R.id.rabtn2:
                        img.setImageResource(R.drawable.img2);
                        break;
                    case R.id.rabtn3:
                        img.setImageResource(R.drawable.img3);
                        break;
                }
            }
        });
    }
}