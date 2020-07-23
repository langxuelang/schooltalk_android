package com.schooltalk.ui.login;

import android.util.Log;

import com.schooltalk.ActivityScope;
import com.schooltalk.repository.HomeListRepository;

import javax.inject.Inject;

/**
 * Created by gaoteng on 2020/7/22.
 */
@ActivityScope
public class LoginViewModel {
    private UserRepository mUserRepository;

    @Inject
    public LoginViewModel(UserRepository homeListRepository) {
        mUserRepository = homeListRepository;
    }

    public void test(){
        Log.d("test",mUserRepository.hashCode()+"");
        mUserRepository.test();
    }
}
