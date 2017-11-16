package com.example.shardul.jsonparsingusinggson;

/**
 * Created by Ding on 2017/11/8.
 */
import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * Created by Administrator on 2016-03-27.
 */
public class HttpUtils {

    OkHttpClient client = new OkHttpClient();
    public static final MediaType JSON
            = MediaType.parse("application/json; charset=utf-8");

    public String login(String url, String json) throws IOException {
        //把請求的內容字元串轉換為json
        RequestBody body = RequestBody.create(JSON, json);
        //RequestBody formBody = new FormEncodingBuilder()

        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();

        Response response = client.newCall(request).execute();

        String result = response.body().string();


        return result;


    }
    public String bolwingJson(String DevEUI, String PayLoad) {
        return "{'DevEUI':" + DevEUI + "," + "'PayLoad':" + PayLoad + "}";
        //     "{'username':" + username + ","+"'password':"+password+"}";
    }


}
