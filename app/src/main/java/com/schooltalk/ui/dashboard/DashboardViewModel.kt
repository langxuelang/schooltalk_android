package com.schooltalk.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.schooltalk.repository.LectureDetailRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DashboardViewModel : ViewModel() {
    private val mText: MutableLiveData<String> = MutableLiveData()
    private val mDetailRepository = LectureDetailRepository()
    val text: LiveData<String>
        get() = mText

    fun loadDetail(){
        viewModelScope.launch(){
            mText.value = mDetailRepository.getLectureDetail()?.body()?.data?.weekhotList?.toString()
        }
    }

    init {
        mText.value = "This is dashboard fragment"
    }
}