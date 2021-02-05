package com.example.journel.ui.join;

import android.net.Uri;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.journel.util.Event;

import java.util.Timer;

import kotlin.Unit;
import timber.log.Timber;

public class JoinViewModel extends ViewModel {

    private MutableLiveData<Event<Unit>> _navigateToGallary = new MutableLiveData<>();//변경가능 : join뷰모델에서만 사용 private
    public LiveData<Event<Unit>> navigateToGallery = _navigateToGallary;//LiveData는 MutableData를 참조 그래서 new없다
    // 라이브데이타는 변경이 불가하기 때문에 이벤트 쓸수 없다.
    //private이니까 밖에서는 수정불가하게(뮤터블), 안에서는 수정가능하게

    private MutableLiveData<Uri> _profileImageUri = new MutableLiveData<>();
    public LiveData<Uri> profileImageUri = _profileImageUri;




    // 위에 두 코드를 합치면
    // private MutableLiveData<Event<Unit>> gallery = _navigateToGallary;
    //피커요청 : 다른 앱에서 사진불러오기
    public void requestPicker(){
        //Timber.d("On requestJoin!!!");
        _navigateToGallary.setValue( new Event<>( Unit.INSTANCE ));

    }
    public void requestJoin(){
       // Timber.d("On requestJoin!!!");//회원가능요청버튼누르면
        //timber : 로그 수집기능
        //라이브러리수정(2군데서)
        //mainApplication
        //joinViewModel

    }

    public void setProfileImageUri(Uri uri){
        _profileImageUri.setValue( uri );
    }
}
