package com.example.cuongphan.widgeteventhandling_namedinnerclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_hello = (Button)findViewById(R.id.btn_hello);
        Button btn_goodbye = (Button)findViewById(R.id.btn_goodbye);
        btn_hello.setOnClickListener(new ShowToast(btn_hello.getText().toString()));
        btn_goodbye.setOnClickListener(new ShowToast(btn_goodbye.getText().toString()));
    }
    private class ShowToast implements View.OnClickListener{
        public String mString = "";
        public ShowToast(String message){
            mString = message;
        }
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, mString, Toast.LENGTH_SHORT).show();
        }
    }
}
