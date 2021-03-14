package com.example.threaddemo;

import android.os.Looper;
import android.util.Log;
import android.widget.EditText;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Http {

    /**
     * 异步get请求
     */
    static void get() {
        String url = "https://v1.alapi.cn/api/eventHitory";
        EditText tvRes = null;
        //第一步获取okHttpClient对象
        OkHttpClient client = new OkHttpClient.Builder().build();

        //第二步构建Request对象
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        //第三步构建Call对象
        Call call = client.newCall(request);

        //第四步发送异步get请求
        call.enqueue(new Callback() {

            //请求失败
            @Override
            public void onFailure(Call call, IOException e) {
                Log.i("ttit", e.getMessage());
            }

            //请求成功
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Looper.prepare();
                //得到子线程
                String result = response.body().string();
                Log.e("ttit", result);
                tvRes.setText(result);
            }
        });
    }
}
