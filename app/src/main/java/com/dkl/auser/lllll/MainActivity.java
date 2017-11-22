package com.dkl.auser.lllll;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.name;

public class MainActivity extends AppCompatActivity {

    private String prf_film;
    private String UserName;
    String PassWord;
    EditText password,name;
    private Button register,signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findView();




    }

    public void signin(){




        SharedPreferences getInfo = getSharedPreferences(prf_film,MODE_PRIVATE);




        if(name.length()==0 && password.length()==0){
            Toast.makeText(this,"欄位不可空白",Toast.LENGTH_SHORT).show();
        }else if(name.getText().toString().equals(getInfo.getString(UserName,"")) || password.getText().toString().equals(getInfo.getString(PassWord,""))){
            Intent it = new Intent();
            it.setClass(MainActivity.this,HomeActivity.class);
                    startActivity(it);
            Toast.makeText(this,"successful",Toast.LENGTH_SHORT).show();
        }else{

            Toast.makeText(this,"failed",Toast.LENGTH_SHORT).show();
        }





//

    }

    public void  register(){
        Intent it = new Intent();
        it.setClass(this,RegisterActivity.class);
        startActivity(it);
    }

    public void findView(){
        name = (EditText)findViewById(R.id.name);
        password = (EditText)findViewById(R.id.password);
        signin = (Button)findViewById(R.id.signin);
        register =  (Button)findViewById(R.id.register);


    }

}
