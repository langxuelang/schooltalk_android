package com.schooltalk.ui.login;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by gaoteng on 2020/7/22.
 */
@Singleton
public class UserRepository {
    private final UserLocalDataSource mUserLocalDataSource;
    private final UserRemoteDataSource mUserRemoteDataSource;
    @Inject
    public UserRepository(UserLocalDataSource userLocalDataSource, UserRemoteDataSource userRemoteDataSource) {
        mUserLocalDataSource = userLocalDataSource;
        mUserRemoteDataSource = userRemoteDataSource;
    }

    public void test(){
        mUserRemoteDataSource.test();
        Log.d("test","UserRepository");
    }
}

