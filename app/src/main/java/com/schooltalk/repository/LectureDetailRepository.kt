package com.schooltalk.repository

import com.schooltalk.api.HomeListService
import com.schooltalk.api.LectureDetailService
import com.schooltalk.model.DataResponse
import com.schooltalk.model.HomeLectureListModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by gaoteng on 2021/7/2.
 */
class LectureDetailRepository {
    var retrofit: Retrofit? = null
    suspend fun getLectureDetail():Response<DataResponse<HomeLectureListModel>>?{
        val lectureDetailService = retrofit?.create(LectureDetailService::class.java)

        val call = lectureDetailService?.getLectureDetail(0, 15)
        return withContext(Dispatchers.IO){

            call?.execute()
        }
    }

    init {
        retrofit = Retrofit.Builder()
            .baseUrl("https://school.gaotenglife.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}