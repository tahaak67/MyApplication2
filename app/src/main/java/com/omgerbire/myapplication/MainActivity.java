package com.omgerbire.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tv;
EditText et;
Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.ext);
        et=findViewById(R.id.etext);
        bt=findViewById(R.id.sbmt);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(et.getText().toString());
            }
        });
    }

    public void nxt(View view) {
        Intent it=new Intent(this,Main2Activity.class);

        startActivity(it);
    }
}
