package com.shubhanshu.musicstructure;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Babu on 07-02-2018.
 */

public class AndroidMusicAdapter extends ArrayAdapter<AndroidMusic> {

    private static final String LOG_TAG = AndroidMusicAdapter.class.getSimpleName();

    public AndroidMusicAdapter(Activity context, ArrayList<AndroidMusic> androidMusics) {
        super(context,0,androidMusics);
    }

@Override
    public View getView(int position, View convertView, ViewGroup parent)
{
    View listItemView = convertView;
    if(listItemView == null)
    {
        listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
    }
    AndroidMusic currentAndroidMusic = getItem(position);

    TextView nameTextView  = (TextView) listItemView.findViewById(R.id.song_name);

    nameTextView.setText(currentAndroidMusic.getSongName());

    TextView singerTextView = (TextView) listItemView.findViewById(R.id.singer_name);
     singerTextView.setText(currentAndroidMusic.getSingerName());

    ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);

    iconView.setImageResource(currentAndroidMusic.getImageResourceId());

    return listItemView;

}

}
