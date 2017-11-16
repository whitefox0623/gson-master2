package com.example.shardul.jsonparsingusinggson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.AsyncTask;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.Toast;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.Spinner;
import android.view.View;
import android.content.Intent;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.util.Log;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
//import org.apache.http.BasicHeader;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
//import org.apache.http.entity.mime.HttpMultipartMode;
//import org.apache.http.entity.mime.MultipartEntity;
//import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.app.Activity;
import android.app.Application;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import javax.net.ssl.HttpsURLConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.client.params.CookiePolicy;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.NameValuePair;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.NetworkResponse;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.manager.RequestManager;
import com.android.volley.manager.RequestManager.RequestListener;
import com.android.volley.manager.LoadController;
import com.android.volley.Request.Method;
import java.util.HashMap;
import java.util.Map;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import org.w3c.dom.Text;
import java.io.IOException;


public class MainActivity extends AppCompatActivity {
    private static final String POST_JSON = "{\"DevEUI\":\"0115580002400063\", \"PayLoad\":\"1\"}";
    private LoadController mLoadController = null;
    TextView _name, _email, _response;
    android.support.v7.widget.AppCompatButton _sendRequest;
    ProgressBar _proProgressBar;
    //    private Spinner mSpn;
    public String serverfinal;
    private String serverAA_url = "http://test.coolux.com.tw/testAA.php";
    private String server28_url = "http://test.coolux.com.tw/test28.php";
    private String timefinal;
    private String time1 = "1000";
    private String time5 = "5000";
//    ImageView img=(ImageView)findViewById(R.id.imageView);


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        //   networkAsyncTask.execute(networkAction);
//        ImageView img=(ImageView)findViewById(R.id.imageViewX);
//        img.setImageResource(R.drawable.p0);
        //使用Spinner
//        Spinner notify = (Spinner)findViewById(R.id.notify_spinner);
//        ArrayAdapter<CharSequence> nAdapter = ArrayAdapter.createFromResource(
//                this, R.array.notify_array, android.R.layout.simple_spinner_item );
//        nAdapter.setDropDownViewResource(
//                android.R.layout.simple_spinner_dropdown_item);
//        notify.setAdapter(nAdapter);
        Spinner spinner = (Spinner) findViewById(R.id.notify_spinner);
        final String[] lunch = {"01155800024001AA", "01155800A4200128"};
        ArrayAdapter<String> lunchList = new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_spinner_dropdown_item,
                lunch);
        spinner.setAdapter(lunchList);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "你選的是" + lunch[position], Toast.LENGTH_SHORT).show();

                if (lunch[position] == "01155800024001AA") {
                    serverfinal = serverAA_url;
                } else {
                    serverfinal = server28_url;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        Spinner spinner2 = (Spinner) findViewById(R.id.notify_spinner2);
        final String[] dinner = {"40s", "60s"};
        ArrayAdapter<String> dinnerList = new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_spinner_dropdown_item,
                dinner);
        spinner2.setAdapter(dinnerList);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "你選的是" + dinner[position], Toast.LENGTH_SHORT).show();

                if (dinner[position] == "40s") {
                    timefinal = time1;
                } else {
                    timefinal = time5;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        Button Buttontopg2 = (Button) findViewById(R.id.buttontopg2);
        Buttontopg2.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Second.class);
                intent.putExtra("server", serverfinal);//可放所有基本類別
                intent.putExtra("time", timefinal);//可放所有基本類別
                //new一個Bundle物件，並將要傳遞的資料傳入
//                Bundle bundle = new Bundle();
//                bundle.putString("server",serverfinal);
//                bundle.putInt("time", timefinal);

                //將Bundle物件assign給intent
//                intent.putExtras(bundle);
                startActivity(intent);
//                MainActivity.this.finish();
            }
        });

        //Hooking the UI views for usage
//        _name = (TextView) findViewById(R.id.name);
//        _email = (TextView) findViewById(R.id.email);
        _response = (TextView) findViewById(R.id.response);
        _proProgressBar = (ProgressBar) findViewById(R.id.progressBar);
        _sendRequest = (AppCompatButton) findViewById(R.id.send_request);
        _name = (EditText) findViewById(R.id.name);
        _email = (EditText) findViewById(R.id.email);









        //hooking onclick listener of button
        _sendRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RequestQueue mQueue = Volley.newRequestQueue(MainActivity.this);

//        1
//                try {
//                    RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
//                    String URL = "http://webserver.coolux.com.tw/public/Application/Downlink";
//                    JSONObject jsonBody = new JSONObject();
//                    jsonBody.put("DevEUI","0115580002400063");
//                    jsonBody.put("PayLoad", "1");
//                    final String mRequestBody = jsonBody.toString();
//
//                    StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
//                        @Override
//                        public void onResponse(String response) {
//                            Log.i("LOG_VOLLEY", response);
//                        }
//                    }, new Response.ErrorListener() {
//                        @Override
//                        public void onErrorResponse(VolleyError error) {
//                            Log.e("LOG_VOLLEY", error.toString());
//                        }
//                    }) {
//                        @Override
//                        public String getBodyContentType() {
//                            return "application/json; charset=utf-8";
//                        }
//
//                        @Override
//                        public byte[] getBody() throws AuthFailureError {
//                            try {
//                                return mRequestBody == null ? null : mRequestBody.getBytes("utf-8");
//                            } catch (UnsupportedEncodingException uee) {
//                                VolleyLog.wtf("Unsupported Encoding while trying to get the bytes of %s using %s", mRequestBody, "utf-8");
//                                return null;
//                            }
//                        }
//
//                        @Override
//                        protected Response<String> parseNetworkResponse(NetworkResponse response) {
//                            String responseString = "";
//                            if (response != null) {
//
//                                responseString = String.valueOf(response.statusCode);
//
//                            }
//                            return Response.success(responseString, HttpHeaderParser.parseCacheHeaders(response));
//                        }
//                    };
//
//                    requestQueue.add(stringRequest);
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }

//2
////
////
////                String postAPI = "http://webserver.coolux.com.tw/public/Application/Downlink";
//                String postAPI = "http://test.coolux.com.tw/showhttppost.php";
//
////                Gson gson = new Gson();
////                String json = gson.toJson();
////                Gson gson = new Gson();
////                User user = new User("怪盗kidou",24);
////                String jsonObject = gson.toJson(User); // {"name":"怪盗kidou","age":24}
////                String jsonObject = "{\"DevEUI\":\"0115580002400063\",\"PayLoad\":1}";
////
////                        userParams.put("DevEUI","0115580002400063");
////                        userParams.put("PayLoad", "1");
//
////                Map<String, String> params = new HashMap<String, String>();
////                params.put("PayLoad", "1");
////                params.put("DevEUI","0115580002400063");
////                JSONObject paramJsonObject = new JSONObject(params);
//
//                JSONObject obj = new JSONObject();
//                try {
//                    obj.put("DevEUI","0115580002400063");
//                    obj.put("PayLoad", "1");
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//                JsonObjectRequest mJsonObjectRequest = new JsonObjectRequest(Request.Method.POST,
//                        postAPI,
//                        obj,
//                        new Response.Listener<JSONObject>() {
//                            @Override
//                            public void onResponse(JSONObject response) {
//                            }
//                        },
//                        new Response.ErrorListener() {
//                            @Override
//                            public void onErrorResponse(VolleyError error) {
//                                Log.e("err", error.toString());
//                            }
//                        }
//                );
//                mQueue.add(mJsonObjectRequest);



//3 ok
//                // Instantiate the RequestQueue.
                RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
                //this is the url where you want to send the request
                //TODO: replace with your own url to send request, as I am using my own localhost for this tutorial
//                String url = "http://webserver.coolux.com.tw/public/Application/Downlink";
                String url = "http://test.coolux.com.tw/showhttppost.php";

//                JsonStr mJsonStr = new JsonStr();
//                mJsonStr.setTitle("foo");
//                mJsonStr.setBody("bar");
//                mJsonStr.setUserId(1);
//                Gson gson = new Gson();
//                String json = gson.toJson(mJsonStr);

                // Request a string response from the provided URL.
                StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                    // Display the response string.
                                _response.setText(response);
                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        _response.setText("That didn't work!");
                    }
                }) {
                    //adding parameters to the request
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> params = new HashMap<>();
//                      params.put("DevEUI","0115580002400063");
                        params.put("DevEUI", _name.getText().toString());
                        params.put("PayLoad", _email.getText().toString());
//                      params.put("PayLoad", "01");

                        return params;
                    }
  //                  adding parameters to the request
//                    @Override
//                    protected Map<String, String> getParams() throws AuthFailureError {
//                        Map<String, String> params = new HashMap<String, String>();
//                        Map<String, String> userParams = new HashMap<String, String>();
//                        userParams.put("DevEUI","0115580002400063");
//                        userParams.put("PayLoad", "1");
//                        JSONObject userJSON = new JSONObject(userParams);
//                        // Nest the object at "user"
//                        params.put("user", userJSON.toString());
//                        return userParams;
////                        params.put("name", _name.getText().toString());
////                        params.put("PayLoad", _email.getText().toString());
////                        params.put("DevEUI", "0115580002400063");
////                        params.put("PayLoad", "on");
////                        return params;
//                    }
                };
                // Add the request to the RequestQueue.
                queue.add(stringRequest);
            }
        });
    }


}










//    class NetworkAsyncTask extends AsyncTask<String, Int
// eger, Map<String, Object>> {
//        //NETWORK_GET表示发送GET请求
//        public static final String NETWORK_GET = "NETWORK_GET";
//        //NETWORK_POST_KEY_VALUE表示用POST发送键值对数据
//        public static final String NETWORK_POST_KEY_VALUE = "NETWORK_POST_KEY_VALUE";
//        //NETWORK_POST_XML表示用POST发送XML数据
//        public static final String NETWORK_POST_XML = "NETWORK_POST_XML";
//        //NETWORK_POST_JSON表示用POST发送JSON数据
//        public static final String NETWORK_POST_JSON = "NETWORK_POST_JSON";
//
//        @Override
//        protected Map<String, Object> doInBackground(String... params) {
//            Map<String, Object> result = new HashMap<>();
//            URL url = null;//请求的URL地址
//            HttpURLConnection conn = null;
//            String requestHeader = null;//请求头
//            byte[] requestBody = null;//请求体
//            String responseHeader = null;//响应头
//            byte[] responseBody = null;//响应体
//            String action = params[0];//http请求的操作类型
//
//        }
//    }


//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                //  postData();
//
//            }
//        });
//        t.start();
//    }
//                }



//    public class SendPostRequest extends AsyncTask<String, Void, String> {
//
//        protected void onPreExecute() {
//        }
//
//        protected String doInBackground(String... arg0) {
//
//            try {
//
//                URL url = new URL("http://test.coolux.com.tw/showhttppost.php"); // here is your URL path
//
//                JSONObject postDataParams = new JSONObject();
//                postDataParams.put("name12345", "abc");
//                postDataParams.put("email", "abc@gmail.com");
//                Log.e("params", postDataParams.toString());
//
//                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//                conn.setReadTimeout(15000 /* milliseconds */);
//                conn.setConnectTimeout(15000 /* milliseconds */);
//                conn.setRequestMethod("POST");
//                conn.setDoInput(true);
//                conn.setDoOutput(true);
//
//                OutputStream os = conn.getOutputStream();
//                BufferedWriter writer = new BufferedWriter(
//                        new OutputStreamWriter(os, "UTF-8"));
//                writer.write(getPostDataString(postDataParams));
//
//                writer.flush();
//                writer.close();
//                os.close();
//
//                int responseCode = conn.getResponseCode();
//
//                if (responseCode == HttpsURLConnection.HTTP_OK) {
//
//                    BufferedReader in = new BufferedReader(new
//                            InputStreamReader(
//                            conn.getInputStream()));
//
//                    StringBuffer sb = new StringBuffer("");
//                    String line = "";
//
//                    while ((line = in.readLine()) != null) {
//
//                        sb.append(line);
//                        break;
//                    }
//
//                    in.close();
//                    return sb.toString();
//
//                } else {
//                    return new String("false : " + responseCode);
//                }
//            } catch (Exception e) {
//                return new String("Exception: " + e.getMessage());
//            }
//
//        }
//
//        @Override
//        protected void onPostExecute(String result) {
//            Toast.makeText(getApplicationContext(), result,
//                    Toast.LENGTH_LONG).show();
//        }
//    }
//
//    public String getPostDataString(JSONObject params) throws Exception {
//
//        StringBuilder result = new StringBuilder();
//        boolean first = true;
//
//        Iterator<String> itr = params.keys();
//
//        while (itr.hasNext()) {
//
//            String key = itr.next();
//            Object value = params.get(key);
//
//            if (first)
//                first = false;
//            else
//                result.append("&");
//
//            result.append(URLEncoder.encode(key, "UTF-8"));
//            result.append("=");
//            result.append(URLEncoder.encode(value.toString(), "UTF-8"));
//
//        }
//        return result.toString();
//    }
//}


//    public void postData() {
//
//        String fullUrl = "http://test.coolux.com.tw/showhttppost.php";
//        httprequest mReq = new httprequest();
//
//        String data = '{' + '"' + "DevEUI" + '"' + ':' + '"' + "01155800A4200128" + '"' + ',' + '"' + "onoroff" + '"' + ':' + '"' + "on" + '"' + '}';
////        String col1 = "Hello";
////        String col2 = "World";
////
////        String data = "entry.1680144410=" + URLEncoder.encode(col1) + "&" +
////                "entry.1558298396=" + URLEncoder.encode(col2);
//        Log.e("i", "i");
//        mReq.sendPost(fullUrl, data);
//
//
//    }}

