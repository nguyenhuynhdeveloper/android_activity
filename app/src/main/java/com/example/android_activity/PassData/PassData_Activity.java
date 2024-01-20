package com.example.android_activity.PassData;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.android_activity.R;

public class PassData_Activity extends AppCompatActivity {

    // Trước khi sử dụng phải khai báo giá trị ở đây trước
   Button button ;
   EditText edt1, edt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_data);
        button = (Button) findViewById(R.id.btn_passData);

        edt1 = (EditText)  findViewById(R.id.edt_a_passData);
        edt2 = (EditText)  findViewById(R.id.edt_b_passData);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // use Extra
//                Intent i = new Intent( PassData_Activity.this, PassData2_Activity.class);
//                i.putExtra("key1", "Lap Trinh cung Eri ");
//                i.putExtra("key2", 20);
//                startActivity(i);

                int num1 = Integer.parseInt(edt1.getText().toString());
                int num2 = Integer.parseInt(edt2.getText().toString());

                Intent i = new Intent( PassData_Activity.this, PassData2_Activity.class);
                Bundle b= new Bundle();
                b.putString("key1", "Lap trinh cung Eri");
                b.putInt("key2", 10);

                b.putInt("num1", num1);
                b.putInt("num2", num2);
                i.putExtras(b);
                startActivity(i);

            }
        });

    }
}