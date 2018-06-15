package com.shubhanshu.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_list_song;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_list_song = (Button)findViewById(R.id.btn_list_song);

      btn_list_song.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

             Intent intent = new Intent(MainActivity.this,AllSong.class);
             startActivity(intent);
          }
      });

    }
}
