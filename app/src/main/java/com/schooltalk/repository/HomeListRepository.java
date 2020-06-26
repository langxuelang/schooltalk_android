package com.schooltalk.repository;

import android.util.Log;

import com.schooltalk.api.HomeListService;
import com.schooltalk.model.DataResponse;
import com.schooltalk.model.HomeLectureListModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by gaoteng on 2020/6/26.
 */
public class HomeListRepository {
    private static final String TAG = "HomeListRepository";
    Retrofit retrofit;
    public HomeListRepository(){
        retrofit = new Retrofit.Builder()
                .baseUrl("https://school.gaotenglife.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


    public void loadHomeList(){
       HomeListService homeListService = retrofit.create(HomeListService.class);
       Call<DataResponse<HomeLectureListModel>> call = homeListService.getHomeList(0,15);
       call.enqueue(new Callback<DataResponse<HomeLectureListModel>>() {
           @Override
           public void onResponse(Call<DataResponse<HomeLectureListModel>> call, Response<DataResponse<HomeLectureListModel>> response) {
               Log.d(TAG,response.body().getData().getGoodsList().toString());
           }

           @Override
           public void onFailure(Call<DataResponse<HomeLectureListModel>> call, Throwable t) {

           }
       });
    }

}
