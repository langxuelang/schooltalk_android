package com.schooltalk.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.fastjson.JSONArray;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.schooltalk.R;
import com.schooltalk.model.HomeLectureListModel;
import com.schooltalk.utils.TimeUtils;


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
        holder.bind(getItem(position));
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
        TextView lecture_time;
        TextView lecture_school;
        TextView lecture_tag;
        ImageView lecture_audio;
        SimpleDraweeView lecture_pic;
        HomeListViewHolder(@NonNull View itemView) {
            super(itemView);
            lecture_name = itemView.findViewById(R.id.lecture_name);
            lecture_pic = itemView.findViewById(R.id.lecture_pic);
            lecture_time = itemView.findViewById(R.id.lecture_time);
            lecture_school = itemView.findViewById(R.id.lecture_shcool);
            lecture_tag = itemView.findViewById(R.id.lecture_tag);
            lecture_audio = itemView.findViewById(R.id.lecture_audio);
        }

        void bind(HomeLectureListModel.LectureInfoModel model){
            lecture_name.setText(model.getLecture_name());
            lecture_time.setText(TimeUtils.getHomeListTimeFormat(model.getLecture_starttime()));
            lecture_school.setText(model.getSchool_name());
            lecture_tag.setText(model.getLecture_tags());

            JSONArray jsonArray = JSONArray.parseArray(model.getLecture_img());

            if(jsonArray != null && jsonArray.size() > 0){
                lecture_pic.setImageURI(jsonArray.get(0).toString());
            }
        }
    }

}
