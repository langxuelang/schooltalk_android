package com.schooltalk.model;

import java.util.List;

/**
 * Created by gaoteng on 2020/6/25.
 */
public class HomeLectureListModel {


    private List<LectureInfoModel> weekhotList;
    private List<LectureInfoModel> goodsList;

    public List<LectureInfoModel> getWeekhotList() {
        return weekhotList;
    }

    public void setWeekhotList(List<LectureInfoModel> weekhotList) {
        this.weekhotList = weekhotList;
    }

    public List<LectureInfoModel> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<LectureInfoModel> goodsList) {
        this.goodsList = goodsList;
    }

    public static class LectureInfoModel {

        private String lecture_id;
        private String cat_id;
        private String lecture_name;
        private String lecture_person;
        private String lecture_desc;
        private String lecture_img;
        private String lecture_tags;
        private String is_series;
        private String lecture_series_name;
        private String add_time;
        private String last_update;
        private String lecture_person_intro;
        private String province_id;
        private String school_id;
        private String province_name;
        private String school_name;
        private String lecture_starttime;
        private String lecture_endtime;
        private String lecture_location;
        private String lecture_enroolurl;
        private Object lecture_audio;

        public String getLecture_id() {
            return lecture_id;
        }

        public void setLecture_id(String lecture_id) {
            this.lecture_id = lecture_id;
        }

        public String getCat_id() {
            return cat_id;
        }

        public void setCat_id(String cat_id) {
            this.cat_id = cat_id;
        }

        public String getLecture_name() {
            return lecture_name;
        }

        public void setLecture_name(String lecture_name) {
            this.lecture_name = lecture_name;
        }

        public String getLecture_person() {
            return lecture_person;
        }

        public void setLecture_person(String lecture_person) {
            this.lecture_person = lecture_person;
        }

        public String getLecture_desc() {
            return lecture_desc;
        }

        public void setLecture_desc(String lecture_desc) {
            this.lecture_desc = lecture_desc;
        }

        public String getLecture_img() {
            return lecture_img;
        }

        public void setLecture_img(String lecture_img) {
            this.lecture_img = lecture_img;
        }

        public String getLecture_tags() {
            return lecture_tags;
        }

        public void setLecture_tags(String lecture_tags) {
            this.lecture_tags = lecture_tags;
        }

        public String getIs_series() {
            return is_series;
        }

        public void setIs_series(String is_series) {
            this.is_series = is_series;
        }

        public String getLecture_series_name() {
            return lecture_series_name;
        }

        public void setLecture_series_name(String lecture_series_name) {
            this.lecture_series_name = lecture_series_name;
        }

        public String getAdd_time() {
            return add_time;
        }

        public void setAdd_time(String add_time) {
            this.add_time = add_time;
        }

        public String getLast_update() {
            return last_update;
        }

        public void setLast_update(String last_update) {
            this.last_update = last_update;
        }

        public String getLecture_person_intro() {
            return lecture_person_intro;
        }

        public void setLecture_person_intro(String lecture_person_intro) {
            this.lecture_person_intro = lecture_person_intro;
        }

        public String getProvince_id() {
            return province_id;
        }

        public void setProvince_id(String province_id) {
            this.province_id = province_id;
        }

        public String getSchool_id() {
            return school_id;
        }

        public void setSchool_id(String school_id) {
            this.school_id = school_id;
        }

        public String getProvince_name() {
            return province_name;
        }

        public void setProvince_name(String province_name) {
            this.province_name = province_name;
        }

        public String getSchool_name() {
            return school_name;
        }

        public void setSchool_name(String school_name) {
            this.school_name = school_name;
        }

        public String getLecture_starttime() {
            return lecture_starttime;
        }

        public void setLecture_starttime(String lecture_starttime) {
            this.lecture_starttime = lecture_starttime;
        }

        public String getLecture_endtime() {
            return lecture_endtime;
        }

        public void setLecture_endtime(String lecture_endtime) {
            this.lecture_endtime = lecture_endtime;
        }

        public String getLecture_location() {
            return lecture_location;
        }

        public void setLecture_location(String lecture_location) {
            this.lecture_location = lecture_location;
        }

        public String getLecture_enroolurl() {
            return lecture_enroolurl;
        }

        public void setLecture_enroolurl(String lecture_enroolurl) {
            this.lecture_enroolurl = lecture_enroolurl;
        }

        public Object getLecture_audio() {
            return lecture_audio;
        }

        public void setLecture_audio(Object lecture_audio) {
            this.lecture_audio = lecture_audio;
        }

        @Override
        public String toString() {
            return "LectureInfoModel{" +
                    "lecture_id='" + lecture_id + '\'' +
                    ", cat_id='" + cat_id + '\'' +
                    ", lecture_name='" + lecture_name + '\'' +
                    ", lecture_person='" + lecture_person + '\'' +
                    ", lecture_desc='" + lecture_desc + '\'' +
                    ", lecture_img='" + lecture_img + '\'' +
                    ", lecture_tags='" + lecture_tags + '\'' +
                    ", is_series='" + is_series + '\'' +
                    ", lecture_series_name='" + lecture_series_name + '\'' +
                    ", add_time='" + add_time + '\'' +
                    ", last_update='" + last_update + '\'' +
                    ", lecture_person_intro='" + lecture_person_intro + '\'' +
                    ", province_id='" + province_id + '\'' +
                    ", school_id='" + school_id + '\'' +
                    ", province_name='" + province_name + '\'' +
                    ", school_name='" + school_name + '\'' +
                    ", lecture_starttime='" + lecture_starttime + '\'' +
                    ", lecture_endtime='" + lecture_endtime + '\'' +
                    ", lecture_location='" + lecture_location + '\'' +
                    ", lecture_enroolurl='" + lecture_enroolurl + '\'' +
                    ", lecture_audio=" + lecture_audio +
                    '}';
        }
    }
}
