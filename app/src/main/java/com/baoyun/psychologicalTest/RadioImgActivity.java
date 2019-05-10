package com.baoyun.psychologicalTest;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class RadioImgActivity extends AppCompatActivity {

    private Context mcontext=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_img);
    }

    @Override
    protected void onStart() {
        super.onStart();
//        Toast.makeText(mcontext,"11",Toast.LENGTH_LONG).show();
//        ImageView imageViewtitle = findViewById(R.id.radioimg_titlepage);
//        imageViewtitle.setImageResource(R.drawable.photo);
//        imageViewtitle =findViewById(R.id.radioimg_pagea);
//        imageViewtitle.setImageResource(R.drawable.photo);
//        imageViewtitle =findViewById(R.id.radioimg_pageb);
//        imageViewtitle.setImageResource(R.drawable.photo);
//        imageViewtitle =findViewById(R.id.radioimg_pagec);
//        imageViewtitle.setImageResource(R.drawable.photo);
//        imageViewtitle =findViewById(R.id.radioimg_paged);
//        imageViewtitle.setImageResource(R.drawable.photo);
//        imageViewtitle =findViewById(R.id.radioimg_pagee);
//        imageViewtitle.setImageResource(R.drawable.photo);

    }

    public void commit(View view){
        Intent intent = new Intent(this,TestResult.class);
        startActivity(intent);
    }

}
