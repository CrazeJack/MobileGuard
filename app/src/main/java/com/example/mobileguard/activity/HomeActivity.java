package com.example.mobileguard.activity;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.view.Window;

import com.example.mobileguard.R;
import com.google.gson.Gson;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
//        //判断savedInstanceState是否为空
//
//        if(savedInstanceState != null){
//            savedInstanceState.getLong("id");
//        }
//        else{
//
//        }
//
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_home);
//        //三级缓存中的内存缓存LruCache
//        android.support.v4.util.LruCache cache = new android.support.v4.util.LruCache(23465);
//        OkHttpClient okHttpClient = new OkHttpClient();
////        BitmapFactory.Options
        initData();
    }

    private void initData() {
        Gson gson = new Gson();
        String str = "{}1;";
//        gson.fromJson(str,new TypeToken<List<ItemInfoBean>>(){}.getType());
    }


    public void upload(View v){
        //客户端编码，Bitmap->byteArray->String
        BitmapFactory.decodeResource(getResources(), R.drawable.splash);
        //客户端结束

//        服务器解码
//        服务器结束

        String json = "qwert";

//        JSONObject jboject = new JSONObject(json);

    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {

        super.onSaveInstanceState(outState, outPersistentState);

        outState.putLong("id",1243546L);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
}
