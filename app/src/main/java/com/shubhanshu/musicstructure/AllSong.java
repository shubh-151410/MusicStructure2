package com.shubhanshu.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;

import com.paypal.android.sdk.payments.PayPalConfiguration;
import com.paypal.android.sdk.payments.PayPalService;
import com.shubhanshu.musicstructure.Config.Config;

import java.util.ArrayList;
public class AllSong extends AppCompatActivity {

    AndroidMusicAdapter musicAdapter;
    Button btn_aboutsong, btn_buySong;
    Intent m_service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_song);
        btn_aboutsong = (Button) findViewById(R.id.btn_aboutsong);
        btn_buySong = (Button) findViewById(R.id.btn_buysong);
        ArrayList<AndroidMusic> androidMusics = new ArrayList<AndroidMusic>();
        androidMusics.add(new AndroidMusic("Diggy Down", "Inna", R.drawable.inna_2));
        androidMusics.add(new AndroidMusic("Shape of You", "Ed Sheeran", R.drawable.ed_sheeran));
        androidMusics.add(new AndroidMusic("I Don’t Wanna Live Forever", "Taylor Shift", R.drawable.tayloshift));
        androidMusics.add(new AndroidMusic("It Ain’t Me", "Selena Golmez", R.drawable.selena));
        androidMusics.add(new AndroidMusic("Paris", "The ChainSmokers", R.drawable.chainsmokers));
        androidMusics.add(new AndroidMusic("Rockabye", "Anne-Marie", R.drawable.anne_marie));
        androidMusics.add(new AndroidMusic("Love on the Brain", "Rihanna", R.drawable.rihanna));
        androidMusics.add(new AndroidMusic("Shining", "Beyonce", R.drawable.beyonce));
        androidMusics.add(new AndroidMusic("Chained to the Rythm", "Katty Perry", R.drawable.katyperry));
        androidMusics.add(new AndroidMusic("Issues", "Jullia Michaels", R.drawable.juliamichaels));


        AndroidMusicAdapter musicAdapter = new AndroidMusicAdapter(this, androidMusics);
        ListView listView = (ListView) findViewById(R.id.listview_song);
        listView.setAdapter(musicAdapter);
        btn_aboutsong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllSong.this, AboutSong.class);
                startActivity(intent);
            }
        });
        btn_buySong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AllSong.this, PaymentActivity.class);
                startActivity(i);
            }

        });


    }

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_search, menu);
        MenuItem item = menu.findItem(R.id.menuSearch);
        SearchView searchView = (SearchView) item.getActionView();


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {

                if (musicAdapter != null) {
                    musicAdapter.getFilter().filter(s);
                }
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}
