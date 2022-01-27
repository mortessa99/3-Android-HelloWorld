package com.example.a3_helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //all of the UI components are Views.(for 'buttonIsClicked' )
    //some times without 'public' app crashing like this app.(after click)
    //and without 'public' color method is gray Although its use in the activity_main.---(now is green)
   public void buttonIsClicked(View buttonIsView){
       TextView txtView = findViewById(R.id.txtView);
       EditText edtName = findViewById(R.id.edtName);
       EditText edtPhone = findViewById(R.id.edtPhone);



        int result = 5 * 94;
        Log.i("multiple",result+"");
        Log.i("mytext",txtView.getText().toString());
        Log.i("myvalue",edtName.getText().toString());
        Log.i("myphone",edtPhone.getText().toString());
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}