package com.gagan.musicalstructureapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsAdapter extends ArrayAdapter<SongBean> {

    public SongsAdapter(@NonNull Context context, ArrayList<SongBean> SongList) {
        super(context, 0,SongList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()) .inflate(
                    R.layout.music_grid_item, parent, false);
        }

        SongBean currentSongList = getItem(position);

        TextView songNameTextView =convertView.findViewById(R.id.SongTextView);
        songNameTextView.setText(currentSongList.getSongName());

        ImageView songImageView=convertView.findViewById(R.id.SongImageView);
        songImageView.setImageResource(currentSongList.getSongImage());

        return convertView;

    }
}
