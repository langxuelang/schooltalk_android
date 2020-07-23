package com.schooltalk.ui.login;

import com.schooltalk.api.HomeListService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by gaoteng on 2020/7/22.
 */
@Module
public class NetworkModule {
    @Singleton
    @Provides
    public HomeListService getHomeListService(){
        return new Retrofit.Builder()
                .baseUrl("https://school.gaotenglife.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(HomeListService.class);
    }

}
