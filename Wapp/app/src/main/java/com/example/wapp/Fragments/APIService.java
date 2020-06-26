package com.example.wapp.Fragments;

import android.hardware.Sensor;

import com.example.wapp.Notifications.MyResponse;
import com.example.wapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAFW54bxs:APA91bHlb7U6UL40llG38SQJJX33dCewGV3Ty4qzAcuAqL0Ifw3P-WAr6OUiauKp63rd4KKYEO56v7CE7aECjBXrzrSfig3fuZ4m4zRuxmCnFfE8X2qR-_1TlSAaHOfGqMjPxVDwI5f0"

            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
