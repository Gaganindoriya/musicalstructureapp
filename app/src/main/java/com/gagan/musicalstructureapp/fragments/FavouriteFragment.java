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

import com.gagan.musicalstructureapp.MusicActivity;
import com.gagan.musicalstructureapp.R;
import com.gagan.musicalstructureapp.SongBean;
import com.gagan.musicalstructureapp.SongsAdapter;
import com.gagan.musicalstructureapp.SongsFavAdapter;

import java.util.ArrayList;


public class FavouriteFragment extends Fragment {


    private SongsFavAdapter songAdapter;
    private GridView gridView;
    private ArrayList<SongBean> songLists;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favourite, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initViews();
        loadData();
    }

    private void initViews() {
        gridView = getActivity().findViewById(R.id.fav_grid);
    }

    private void loadData() {
        //Array List Of songs
        songLists = new ArrayList<>();
        songLists.add(new SongBean("Music", R.drawable.favicon));
        songLists.add(new SongBean("Music", R.drawable.favicon));
        songLists.add(new SongBean("Music", R.drawable.favicon));
        songLists.add(new SongBean("Music", R.drawable.favicon));
        songLists.add(new SongBean("Music", R.drawable.favicon));
        songLists.add(new SongBean("Music", R.drawable.favicon));
        songLists.add(new SongBean("Music", R.drawable.favicon));
        songLists.add(new SongBean("Music", R.drawable.favicon));
        songLists.add(new SongBean("Music", R.drawable.favicon));
        songLists.add(new SongBean("Music", R.drawable.favicon));
        songLists.add(new SongBean("Music", R.drawable.favicon));
        songLists.add(new SongBean("Music", R.drawable.favicon));
        songLists.add(new SongBean("Music", R.drawable.favicon));
        songLists.add(new SongBean("Music",R.drawable.favicon));
        songLists.add(new SongBean("Music",R.drawable.favicon));



        songAdapter = new SongsFavAdapter(getActivity(), songLists);

//OnClickListener for grid View If user Click any Grid start playing song
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                SongBean songList = (SongBean) parent.getItemAtPosition(position);
                Intent songNameIntent = new Intent(getActivity(), MusicActivity.class);
                startActivity(songNameIntent);
            }
        });
        // for setting adapter to grid view
        gridView.setAdapter(songAdapter);

    }


}
