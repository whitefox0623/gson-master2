package com.example.shardul.jsonparsingusinggson;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.List;
import java.util.*;
import android.content.Intent;


//import org.apache.http.HttpEntity;
//import org.apache.http.HttpResponse;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.entity.StringEntity;

/**
 * Created by Ding on 2017/10/3.
 */

public class Second extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private ImageView img;



    //  private String serverAA_url = "http://test.coolux.com.tw/testAA.php";
    private RecyclerAdapter adapter;
    Timer timer = new Timer(true);
    String SF;
    int T;

//    Intent intent = this.getIntent();
////    //取得傳遞過來的資料
//    String ServerFinal = intent.getStringExtra("server");

    // 取的intent中的bundle物件
//    Bundle bundle =this.getIntent().getExtras();
//
//    String ServerFinal = bundle.getString("server");
    //   int height = bundle.getInt("time");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = this.getIntent();
        String ServerFinal = intent.getStringExtra("server");
        String Time = intent.getStringExtra("time");
        SF=ServerFinal;
        T=Integer.parseInt(Time);

        setContentView(R.layout.activity_main);

//        int [] pic =new int[]{R.drawable.p0 , R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4,
//                R.drawable.p5, R.drawable.p6, R.drawable.p7, R.drawable.p8, R.drawable.p9};

//        img=(ImageView)findViewById(R.id.imageView);
//        img.setImageResource(R.drawable.p0);




        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        timer.schedule(new Second.MyTimerTask(), T, T);




//        Button Buttontopg1 = (Button) findViewById(R.id.buttontopg1);
//        Buttontopg1.setOnClickListener(new Button.OnClickListener() {
//            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.setClass(Second.this, MainActivity.class);
//
//                startActivity(intent);
//                Second.this.finish();
//
//
//            }
//        });

//        getinformation();

    }


    public class MyTimerTask extends TimerTask
    {
//        ImageView img=(ImageView)findViewById(R.id.imageView);

        public void run()
        {
            getinformation();
            //      Toast.makeText(MainActivity.this,"123124",Toast.LENGTH_SHORT);

//            int [] pic =new int[]{R.drawable.p0 , R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4,
//                    R.drawable.p5, R.drawable.p6, R.drawable.p7, R.drawable.p8, R.drawable.p9};
//
//
//            img.setImageResource(pic[0]);
        };

    };


    public void getinformation(){
        StringRequest stringRequest = new StringRequest(Request.Method.POST,SF,
                new Response.Listener<String>(){

                    @Override
                    public void onResponse(String response) {

                        GsonBuilder builder = new GsonBuilder();
                        Gson gson = builder.create();

                        List<Contact> list = Arrays.asList(gson.fromJson(response,Contact[].class));
                        adapter = new RecyclerAdapter(list);
                        recyclerView.setAdapter(adapter);


//                        String PL1=getDevEUI;


                    }
                }, new Response.ErrorListener(){

            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        MySingleton.getInstance(this).addToRequestQue(stringRequest);


//        int [] pic =new int[]{R.drawable.p0 , R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4,
//                R.drawable.p5, R.drawable.p6, R.drawable.p7, R.drawable.p8, R.drawable.p9};
//
//        img.setImageResource(pic[]);





    }




}
