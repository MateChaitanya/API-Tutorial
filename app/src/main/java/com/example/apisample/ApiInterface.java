package com.example.apisample;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.Call;

public interface ApiInterface {

@GET("posts")
    Call<List<PostPojo>> getposts();
}
