package com.example.journel.ui.feed;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.journel.R;
import com.example.journel.ui.join.JoinFragment;


public class FeedFragment extends Fragment {


    public static FeedFragment newInstance() {
        return new FeedFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate( R.layout.fragment_feed, container, false );
        root.findViewById( R.id.navigatePostButton ).setOnClickListener( v->{
            NavDirections action = FeedFragmentDirections.actionFeedFragmentToPostFragment();
            Navigation.findNavController( v ).navigate( action );

        } );




        return root;
    }
}