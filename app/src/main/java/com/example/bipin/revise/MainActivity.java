package com.example.bipin.revise;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
   EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);


    }

    public void doSomething(View view) {

      Intent i=new Intent(MainActivity.this,Main2Activity.class);
        i.putExtra("user",e1.getText().toString());
        i.putExtra("pass",e2.getText().toString());
        startActivity(i);


        }

}
