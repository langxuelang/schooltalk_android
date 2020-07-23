package com.schooltalk.ui.login;

import com.schooltalk.api.HomeListService;
import com.schooltalk.model.DataResponse;
import com.schooltalk.model.HomeLectureListModel;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by gaoteng on 2020/7/22.
 */
public class UserRemoteDataSource {

    private final HomeListService mHomeListService;

    @Inject
    public UserRemoteDataSource(HomeListService homeListService) {
        mHomeListService = homeListService;
    }

    public void test(){
        mHomeListService.getHomeList(0,50).enqueue(new Callback<DataResponse<HomeLectureListModel>>() {
            @Override
            public void onResponse(Call<DataResponse<HomeLectureListModel>> call, Response<DataResponse<HomeLectureListModel>> response) {

            }

            @Override
            public void onFailure(Call<DataResponse<HomeLectureListModel>> call, Throwable t) {

            }
        });
    }
}
