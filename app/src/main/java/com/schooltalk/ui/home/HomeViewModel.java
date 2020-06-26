package com.schooltalk.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.schooltalk.model.HomeLectureListModel;
import com.schooltalk.repository.HomeListRepository;

import java.util.List;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<HomeLectureListModel> mHomeList;

    private HomeListRepository mHomeListRepository;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
        mHomeListRepository = new HomeListRepository();
        mHomeList = mHomeListRepository.loadHomeList();
    }

    public LiveData<String> getText() {
        return mText;
    }

    public MutableLiveData<HomeLectureListModel> getHomeList() {
        return mHomeList;
    }
}