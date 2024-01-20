package com.example.android_activity.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



import com.example.android_activity.R;

public class MainActivity extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.btnClickMe);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
/*
                Intent i = new Intent (MainActivity.this, Main2Activity.class);
                startActivity(i);  // Sang màn hình số 2
*/

                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.facebook.com/?locale=vi_VN"));
                startActivity(i);
            }
        });
    }
}