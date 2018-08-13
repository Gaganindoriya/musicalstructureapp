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

public class SongsListAdapter extends ArrayAdapter<SongBean> {

    public SongsListAdapter(@NonNull Context context, ArrayList<SongBean> SongList) {
        super(context, 0,SongList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()) .inflate(
                    R.layout.music_list_item, parent, false);
        }

        SongBean currentSongList = getItem(position);

        TextView songNameTextView =listItemView.findViewById(R.id.SongTextView);
        songNameTextView.setText(currentSongList.getSongName());

        ImageView songImageView= listItemView.findViewById(R.id.SongImageView);
        songImageView.setImageResource(currentSongList.getSongImage());

        return listItemView;

    }
}
