package com.example.a3_helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //all of the UI components are Views.(for 'buttonIsClicked' )
    //some times without 'public' app crashing like this app.(after click)
    //and without 'public' color method is gray Although its use in the activity_main.---(now is green)
   @SuppressLint("WrongConstant")
   public void buttonIsClicked(View buttonIsView){
       TextView txtView = findViewById(R.id.txtView);
       EditText edtName = findViewById(R.id.edtName);
       EditText edtPhone = findViewById(R.id.edtPhone);



        int result = 5 * 94;
        Log.i("multiple",result+"");
        Log.i("mytext",txtView.getText().toString());
        Log.i("myvalue",edtName.getText().toString());
        Log.i("myphone",edtPhone.getText().toString());
       Toast.makeText(this,
               "Your Name is"+" "+edtName.getText().toString()+
                       "\n"+"Your Phone is"+" "+edtPhone.getText().toString(),
               (1)).show();
    }

    ImageView imgV;
    Button btnClick;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgV = findViewById(R.id.imgV);
        btnClick = findViewById(R.id.btnClick);

        btnClick.setOnClickListener(view -> {
            imgV.setImageResource(R.drawable.ic_launcher_background);
        });
    }

}