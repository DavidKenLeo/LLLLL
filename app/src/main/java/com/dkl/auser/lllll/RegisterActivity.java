package com.dkl.auser.lllll;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private String pref_film;
    private EditText age,name,password,sex;
    private Button register2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        findView();


    }

    public  void  register2() {
        Intent it = new Intent();
        SharedPreferences saveInfo = getSharedPreferences(pref_film, MODE_PRIVATE);
        if(name.length()==0 && password.length()==0){
            Toast.makeText(this,"register successeful",Toast.LENGTH_SHORT).show();
        }else {


            Toast.makeText(this, "欄位不可空白", Toast.LENGTH_SHORT).show();
        }
    }



    public void findView(){
        name = (EditText)findViewById(R.id.name2);
        password = (EditText)findViewById(R.id.password2);
        sex = (EditText)findViewById(R.id.sex);
        age =  (EditText)findViewById(R.id.age);
        register2 = (Button)findViewById(R.id.register2);


    }

}
