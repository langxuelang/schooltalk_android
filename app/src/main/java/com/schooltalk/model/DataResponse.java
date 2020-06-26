package com.schooltalk.model;

/**
 * Created by gaoteng on 2020/6/26.
 */
public class DataResponse<T> {
    int apiStatus;
    String msg;
    String id;
    T data;

    public int getApiStatus() {
        return apiStatus;
    }

    public void setApiStatus(int apiStatus) {
        this.apiStatus = apiStatus;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
