package com.example.journel.ui.login;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.journel.databinding.FragmentLoginBinding;
import com.example.journel.R;
import com.example.journel.util.EventObserver;

//여기서 버튼 두개 : 프래그먼트이동 (네브디렉션,네브컨트롤러)+ 메인액티비티로이동(인텐트)
public class LoginFragment extends Fragment {

    private NavDirections mActionJoinFragment = LoginFragmentDirections.actionLoginFragmentToJoinFragment();
    private LoginViewModel mLoginViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentLoginBinding binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_login, container, false);
        mLoginViewModel = new LoginViewModel();
        binding.setViewModel(mLoginViewModel);

//        binding.btnNaviToJoinFragment.setOnClickListener(v -> {
//            Navigation.findNavController(v).navigate(mActionJoinFragment);
//            Toast.makeText(getContext(), "OnClicked JoinButton", Toast.LENGTH_LONG).show();
//        });
//        binding.btnNaviToMain.setOnClickListener(v -> {
//            Intent intent = new Intent(getContext(), MainActivity.class);
//            startActivity(intent);
//        });
        setUpViewModel();
        return binding.getRoot();
    }
    private void setUpViewModel(){
        mLoginViewModel.navigateToJoinEvent.observe( getViewLifecycleOwner(), new EventObserver<>(data -> {
            Navigation.findNavController(getView()).navigate(mActionJoinFragment);

        }  ) );

    }
}