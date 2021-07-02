package com.schooltalk.api;

import com.schooltalk.model.DataResponse;
import com.schooltalk.model.HomeLectureListModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by gaoteng on 2020/6/26.
 */
public interface LectureDetailService {

    @GET("system/goods/gethomelist")
    Call<DataResponse<HomeLectureListModel>> getLectureDetail(@Query("start") int start, @Query("count")int count);
}
