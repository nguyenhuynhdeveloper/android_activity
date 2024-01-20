package com.example.android_activity.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.android_activity.R;

public class ActivityLifeCycle extends AppCompatActivity {
private static final String STATE = "Trang thai";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Log.e(STATE, "onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e(STATE, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(STATE, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(STATE, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(STATE, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(STATE, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(STATE, "onDestroy");
    }
    // cũng là 1 thành phần trạng thái vòng đời
    // truyền , phục hồi , lưu trạng thái của 1 Activity


    @Override
    protected void onSaveInstanceState( Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(STATE, "onSaveInstanceState");
    }

    // Khi mới mở activity thì onCreate, onStart, onResume được chạy
    // Khi bấm nút home để app chạy ẩn - onPause, onStop, onSaveInstanceState được chạy
    // Khi vào lại app onStart , onResume được gọi tới
    // Hoặc nhấn nút back để quay trở lại -- onDestroy được gọi
    // Lúc này mở lại chương trình thêm 1 lần nữa - onCreate, onStart, onResume được gọi
}