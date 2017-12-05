package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void func1(View view){
        getIntent();
    }

    public void func2(View view){
        getIntent();
    }

    public void func3(View view){
        getIntent();
        Toast.makeText(this, "特殊功能", Toast.LENGTH_LONG).show();
        finish();
    }

    public void func4(View view){
        getIntent();
    }

    public void func5(View view){
        getIntent();
    }

    public void func6(View view){
        getIntent();
    }

    public void func7(View view){
        getIntent();
        Toast.makeText(this, "特殊功能", Toast.LENGTH_LONG).show();
        finish();
    }

    public void func8(View view){
        getIntent();
        Toast.makeText(this, "特殊功能", Toast.LENGTH_LONG).show();
        finish();
    }
}
