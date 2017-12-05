package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public final static int FUNC_3 = 3;
    public final static int FUNC_7 = 7;
    public final static int FUNC_8 = 8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void func1(View view){
        Intent intent = new Intent(this, Func1Activity.class);
        startActivity(intent);
    }

    public void func2(View view){
        Intent intent = new Intent(this, Func2Activity.class);
        startActivity(intent);
    }

    public void func3(View view){
        Intent intent = new Intent(this, Func3Activity.class);
        startActivityForResult(intent, FUNC_3);
    }

    public void func4(View view){
        Intent intent = new Intent(this, Func4Activity.class);
        startActivity(intent);
    }

    public void func5(View view){
        Intent intent = new Intent(this, Func5Activity.class);
        startActivity(intent);
    }

    public void func6(View view){
        Intent intent = new Intent(this, Func6Activity.class);
        startActivity(intent);
    }

    public void func7(View view){
        Intent intent = new Intent(this, Func7Activity.class);
        startActivityForResult(intent, FUNC_7);
    }

    public void func8(View view){
        Intent intent = new Intent(this, Func8Activity.class);
        startActivityForResult(intent, FUNC_8);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == FUNC_3 || requestCode == FUNC_7 || requestCode == FUNC_8){
            Toast.makeText(this, "特殊功能", Toast.LENGTH_LONG).show();
        }
    }
}
