package com.schooltalk.ui.home;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

import com.schooltalk.model.HomeLectureListModel;
import com.schooltalk.model.HomeLectureListQueryModel;
import com.schooltalk.repository.HomeListRepository;

import java.util.List;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<HomeLectureListModel> mHomeList;
    private MutableLiveData<HomeLectureListQueryModel> mQuery = new MutableLiveData<>();

    private HomeListRepository mHomeListRepository;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
        mHomeListRepository = new HomeListRepository();

        mHomeList = (MutableLiveData<HomeLectureListModel>)Transformations.switchMap(mQuery, input -> mHomeListRepository.loadHomeList(input));
    }

    public LiveData<String> getText() {
        return mText;
    }

    public MutableLiveData<HomeLectureListModel> getHomeList() {
        return mHomeList;
    }

    public void setQuery(HomeLectureListQueryModel query) {
        mQuery.setValue(query);
    }
}