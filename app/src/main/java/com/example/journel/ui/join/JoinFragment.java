package com.example.journel.ui.join;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.journel.R;
import com.example.journel.databinding.FragmentJoinBinding;
import com.example.journel.util.EventObserver;


public class JoinFragment extends Fragment {

    private FragmentJoinBinding mBinding;
    private JoinViewModel mJoinViewModel;
    private ActivityResultLauncher<String> mGetContent = registerForActivityResult(
            new ActivityResultContracts.GetContent(),//어떤 데이터를 가져올 계약서
            new ActivityResultCallback<Uri>() {
                @Override
                public void onActivityResult(Uri result) {
                    mJoinViewModel.setProfileImageUri( result );
                }
            } );

//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate( savedInstanceState );
//    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_join, container, false );

        mJoinViewModel = new JoinViewModel();
        mBinding.setViewModel( mJoinViewModel );
        setUpViewModel();
        return mBinding.getRoot();
    }

    private void setUpViewModel() {
        mJoinViewModel.navigateToGallery.observe( getViewLifecycleOwner(), new EventObserver<>( data -> {
            mGetContent.launch( "image/*" );
        } ) );
        mJoinViewModel.profileImageUri.observe( getViewLifecycleOwner(), uri -> {
            mBinding.addProfileImageView.setImageURI( uri );
        } );
    }
}

















