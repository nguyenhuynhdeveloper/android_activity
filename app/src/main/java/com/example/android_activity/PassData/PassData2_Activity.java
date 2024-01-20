package com.example.android_activity.PassData;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.android_activity.R;

public class PassData2_Activity extends AppCompatActivity {
    // define textView and map it
    TextView tv1_passData, tv2_passData, tv_sum_passData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_data2);
        tv1_passData = (TextView) findViewById(R.id.tv1_passData);
        tv2_passData = (TextView) findViewById(R.id.tv2_passData);

        tv_sum_passData= (TextView) findViewById(R.id.tv_sum_passData);

        Intent i = getIntent();

        // use Extra
//        String value1 = i.getStringExtra("key1");
//        int value2 = i.getIntExtra("key2", 10);

        // use Bundle
        Bundle b = i.getExtras();
        String value1 = b.getString("key1");
        int value2 = b.getInt("key2", 0);

        int num1 = b.getInt("num1", 0);
        int num2 = b.getInt("num2", 1);
        int sum = num1 + num2;

        tv1_passData.setText(value1);
        tv2_passData.setText(""+value2);
        tv_sum_passData.setText("Tong cua a va b la: " + sum);
    }
}