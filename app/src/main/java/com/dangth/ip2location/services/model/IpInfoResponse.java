package com.dangth.ip2location.services.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IpInfoResponse implements Serializable {
    private final static long serialVersionUID = -2076024437610846467L;

    @SerializedName("as")
    @Expose
    public String as;
    @SerializedName("city")
    @Expose
    public String city;
    @SerializedName("country")
    @Expose
    public String country;
    @SerializedName("countryCode")
    @Expose
    public String countryCode;
    @SerializedName("isp")
    @Expose
    public String isp;
    @SerializedName("lat")
    @Expose
    public double lat;
    @SerializedName("lon")
    @Expose
    public double lon;
    @SerializedName("org")
    @Expose
    public String org;
    @SerializedName("query")
    @Expose
    public String query;
    @SerializedName("region")
    @Expose
    public String region;
    @SerializedName("regionName")
    @Expose
    public String regionName;
    @SerializedName("status")
    @Expose
    public String status;
    @SerializedName("timezone")
    @Expose
    public String timezone;
    @SerializedName("zip")
    @Expose
    public String zip;

    @Override
    public String toString() {
        return "IpInfoResponse{" +
                "as='" + as + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", isp='" + isp + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", org='" + org + '\'' +
                ", query='" + query + '\'' +
                ", region='" + region + '\'' +
                ", regionName='" + regionName + '\'' +
                ", status='" + status + '\'' +
                ", timezone='" + timezone + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}