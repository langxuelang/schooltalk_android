package com.schooltalk.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.schooltalk.R;
import com.schooltalk.databinding.FragmentHomeBinding;
import com.schooltalk.model.HomeLectureListModel;
import com.schooltalk.model.HomeLectureListQueryModel;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    FragmentHomeBinding mFragmentHomeBinding;
    HomeListAdapter mHomeListAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        mFragmentHomeBinding = FragmentHomeBinding.inflate(inflater,container,false);

        View root = mFragmentHomeBinding.getRoot();

        mHomeListAdapter = new HomeListAdapter();
        mFragmentHomeBinding.list.setAdapter(mHomeListAdapter);
        mFragmentHomeBinding.list.setLayoutManager(new LinearLayoutManager(getContext()));

        homeViewModel.setQuery(new HomeLectureListQueryModel());

        homeViewModel.getHomeList().observe(getViewLifecycleOwner(), new Observer<HomeLectureListModel>() {
            @Override
            public void onChanged(HomeLectureListModel homeLectureListModel) {
                if(homeLectureListModel != null){
                    mHomeListAdapter.submitList(homeLectureListModel.getGoodsList());
                }
            }
        });
        return root;
    }
}