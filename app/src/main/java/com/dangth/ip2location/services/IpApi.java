package com.dangth.ip2location.services;

import com.dangth.ip2location.services.model.IpInfoResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IpApi {
    @GET
    Call<IpInfoResponse> getIpInfo();
}
