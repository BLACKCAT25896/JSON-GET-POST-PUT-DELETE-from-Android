package com.example.retrofit.retrofit;

import com.example.retrofit.User;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RetrofitInterface {


    @GET("posts")
    Call<List<User>> getData();

    @POST("posts")
    Call<ResponseBody> insertData(

            @Field("userId") int userId,
            @Field("id") int id,
            @Field("title") String title,
            @Field("body") String body
    );
}
