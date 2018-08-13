package com.gagan.musicalstructureapp.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import com.gagan.musicalstructureapp.MusicActivity;
import com.gagan.musicalstructureapp.R;
import com.gagan.musicalstructureapp.SongBean;
import com.gagan.musicalstructureapp.SongsAdapter;
import com.gagan.musicalstructureapp.SongsListAdapter;

import java.util.ArrayList;


public class SongsListFragment extends Fragment {
    private SongsListAdapter songAdapter;
    private ListView listView;
    private ArrayList<SongBean> songLists;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_songs_list, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initViews();
        loadData();
    }

    private void initViews() {
        listView = getActivity().findViewById(R.id.songs_list_view);
    }

    private void loadData() {
        //Array List Of songs
        songLists = new ArrayList<>();
        songLists.add(new SongBean("Music", R.drawable.music_icon));
        songLists.add(new SongBean("Music", R.drawable.music_icon));
        songLists.add(new SongBean("Music", R.drawable.music_icon));
        songLists.add(new SongBean("Music", R.drawable.music_icon));
        songLists.add(new SongBean("Music", R.drawable.music_icon));
        songLists.add(new SongBean("Music", R.drawable.music_icon));
        songLists.add(new SongBean("Music", R.drawable.music_icon));
        songLists.add(new SongBean("Music", R.drawable.music_icon));
        songLists.add(new SongBean("Music", R.drawable.music_icon));
        songLists.add(new SongBean("Music", R.drawable.music_icon));
        songLists.add(new SongBean("Music", R.drawable.music_icon));
        songLists.add(new SongBean("Music", R.drawable.music_icon));
        songLists.add(new SongBean("Music", R.drawable.music_icon));
        songLists.add(new SongBean("Music", R.drawable.music_icon));
        songLists.add(new SongBean("Music", R.drawable.music_icon));
        songLists.add(new SongBean("Music", R.drawable.music_icon));
        songLists.add(new SongBean("Music", R.drawable.music_icon));
        songLists.add(new SongBean("Music", R.drawable.music_icon));


        songAdapter = new SongsListAdapter(getActivity(), songLists);
        //item click listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                SongBean songList = (SongBean) parent.getItemAtPosition(position);
                Intent songNameIntent = new Intent(getActivity(), MusicActivity.class);
                startActivity(songNameIntent);
            }
        });

        listView.setAdapter(songAdapter);
    }
}

