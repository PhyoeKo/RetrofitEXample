package com.phyoeko.example.retrofitexample.retrofit;

import com.phyoeko.example.retrofitexample.data.model.SOAnswersResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface SOService {

    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
    Observable<SOAnswersResponse> getAnswers();

    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
    Observable<SOAnswersResponse> getAnswers(@Query("tagged") String tags);
}
