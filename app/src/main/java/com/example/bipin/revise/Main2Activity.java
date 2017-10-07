package com.example.bipin.revise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView2);

        Bundle b1=getIntent().getExtras();
        String s1=b1.getString("user");
        String s2=b1.getString("pass");
        t1.setText(s1);
        t2.setText(s2);

    }


}
