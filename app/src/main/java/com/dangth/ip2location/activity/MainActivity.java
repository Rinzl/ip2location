package com.dangth.ip2location.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.dangth.ip2location.R;
import com.dangth.ip2location.services.IpApi;
import com.dangth.ip2location.services.RetrofitInstance;
import com.dangth.ip2location.services.model.IpInfoResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements Callback<IpInfoResponse> {

    private IpApi ipApi;
    private TextView tvInfo;
    private Button btnIno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvInfo = findViewById(R.id.tvInfo);
        btnIno = findViewById(R.id.btnInfo);
        ipApi = RetrofitInstance.getRetrofitInstance().create(IpApi.class);

        final Call<IpInfoResponse> call = ipApi.getIpInfo();

        btnIno.setOnClickListener(view -> call.enqueue(MainActivity.this));

    }

    @Override
    public void onResponse(Call<IpInfoResponse> call, Response<IpInfoResponse> response) {
        try {
            IpInfoResponse ipInfoResponse = response.body();
            if (ipInfoResponse != null) {
                tvInfo.setText(ipInfoResponse.toString());
            }
            else {
                Toast.makeText(this, "Response is null", Toast.LENGTH_SHORT).show();

            }
        } catch (Exception ex) {
            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onFailure(Call<IpInfoResponse> call, Throwable t) {
        Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
    }
}
