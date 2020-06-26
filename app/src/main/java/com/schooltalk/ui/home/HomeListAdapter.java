package com.schooltalk.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.schooltalk.R;
import com.schooltalk.model.HomeLectureListModel;

/**
 * Created by gaoteng on 2020/6/26.
 */
public class HomeListAdapter extends ListAdapter<HomeLectureListModel.LectureInfoModel, HomeListAdapter.HomeListViewHolder> {

    public HomeListAdapter() {
        super(DIFF_CALLBACK);
    }

    @NonNull
    @Override
    public HomeListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_lecture_item_info,parent,false);
        return new HomeListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeListViewHolder holder, int position) {
        holder.lecture_name.setText(getItem(position).getLecture_name());
    }

    public static final DiffUtil.ItemCallback<HomeLectureListModel.LectureInfoModel> DIFF_CALLBACK =
            new DiffUtil.ItemCallback<HomeLectureListModel.LectureInfoModel>() {
                @Override
                public boolean areItemsTheSame(@NonNull HomeLectureListModel.LectureInfoModel oldItem, @NonNull HomeLectureListModel.LectureInfoModel newItem) {
                    return oldItem.getLecture_id().equals(newItem.getLecture_id());
                }

                @Override
                public boolean areContentsTheSame(@NonNull HomeLectureListModel.LectureInfoModel oldItem, @NonNull HomeLectureListModel.LectureInfoModel newItem) {
                    return oldItem.getLecture_name().equals(newItem.getLecture_name());
                }
            };


    static class HomeListViewHolder extends RecyclerView.ViewHolder {
        TextView lecture_name;
        HomeListViewHolder(@NonNull View itemView) {
            super(itemView);
            lecture_name = itemView.findViewById(R.id.lecture_name);

        }
    }

}
