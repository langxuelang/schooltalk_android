package com.schooltalk;

import com.schooltalk.ui.login.LoginViewModel;
import com.schooltalk.ui.login.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by gaoteng on 2020/7/22.
 */
@Singleton
@Component(modules = {NetworkModule.class,SubcomponentsModule.class})
public interface ApplicationComponent {
    //void inject(MainActivity mainActivity);
    //LoginViewModel getViewModle();
    LoginComponent.Factory loginComponent();
}
