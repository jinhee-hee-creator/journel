package com.example.journel.ui.login;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.journel.util.Event;
//void랑 비슷 = unit
import kotlin.Unit;

public class LoginViewModel extends ViewModel {
//2.unit : event객체의 타입
    //_ : 변경가능한 변수라는 뜻 - MutableLiveData
    private MutableLiveData<Event<Unit>> _navigateToJoinEvent = new MutableLiveData<>();
//3.
    public LiveData<Event<Unit>> navigateToJoinEvent = _navigateToJoinEvent;
//1.LiveData의 타입중 이벤트타입 만드는 중
    public void navigateToJoin() {
        //4.
        _navigateToJoinEvent.setValue( new Event<>( Unit.INSTANCE ) );
        //setValue : 변수를 바로 바꾸는것 vs postValue : 시간이 흐른후
    }


    //  public LiveData<String> joinButtonText = new MutableLiveData<>("Join");

    // public void navigateToJoin(){
    //   Log.d("LoginModel","onClick!!");
    //}

    //    private NavDirections mActionJoinFragment = LoginFragmentDirections.actionLoginFragmentToJoinFragment();

//    public void navigateToJoinFragment(View v) {
//        Navigation.findNavController( v ).navigate( mActionJoinFragment );
//        Toast.makeText( mContext, "onclicked", Toast.LENGTH_LONG ).show();
//    }
//
//    public void navigateToMainActivity() {
//        Intent intent = new Intent( mContext, MainActivity.class );
//        mContext.startActivity( intent );//fragment혹은 appcompatactivity만 startactivity할수 있기 때문에 context힐요
//    }

}