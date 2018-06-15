package com.shubhanshu.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutSong extends AppCompatActivity {
Button btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_song);
        btn_back = (Button)findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View view)
        {
            Intent i = new Intent(AboutSong.this,AllSong.class);
            startActivity(i);
        }
        });
    }
}
