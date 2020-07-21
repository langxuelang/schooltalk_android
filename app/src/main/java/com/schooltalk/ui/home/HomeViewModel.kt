package com.schooltalk.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.schooltalk.model.HomeLectureListModel
import com.schooltalk.model.HomeLectureListQueryModel
import com.schooltalk.repository.HomeListRepository

/**
 * Created by gaoteng on 2020/7/21.
 */
class HomeViewModel: ViewModel() {
    private val mQuery:MutableLiveData<HomeLectureListQueryModel> = MutableLiveData()

    private val mHomeListRepository:HomeListRepository = HomeListRepository()

    val mHomeList:LiveData<HomeLectureListModel> = Transformations.switchMap(mQuery) { input -> mHomeListRepository.loadHomeList(input) }

    fun setQuery(queryModel: HomeLectureListQueryModel){
        mQuery.value = queryModel
    }
}