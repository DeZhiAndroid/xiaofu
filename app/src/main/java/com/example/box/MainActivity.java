package com.example.box;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button bt_enter;
    private EditText et_mm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_mm=findViewById(R.id.et_mm);
        bt_enter=findViewById(R.id.bt_enter);
    }

    public void First_Enter(View view) {
        String MiMa=et_mm.getText().toString().trim();
        if (MiMa.equals(""))
        {
            Toast.makeText(this,"不输密码可是打不开我的",Toast.LENGTH_LONG).show();
        }
        else if (MiMa.equals("we need to"))
        {
            Intent intent=new Intent(this,MainActivity2.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(this,"我是你爸爸我是你爸爸",Toast.LENGTH_LONG).show();
        }
    }
}