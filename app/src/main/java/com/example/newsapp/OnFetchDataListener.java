package com.example.newsapp;

import com.example.newsapp.models.NewsHeadline;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse> {
    void onFetchData(List<NewsHeadline> list,String message);
    //handle eroor
    void onError(String message);
}
