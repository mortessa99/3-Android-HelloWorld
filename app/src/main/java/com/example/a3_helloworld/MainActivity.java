package com.example.a3_helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //all of the UI components are Views.(for 'buttonIsClicked' )
    //some times without 'public' app crashing like this app.(after click)
    //and without 'public' color method is gray (now is green)
   public void buttonIsClicked(View buttonIsView){
        int result = 5 * 94;
        Log.i("multiple",result+"");
        Log.i("mytext",txtView.getText().toString());
    }

    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtView = findViewById(R.id.txtView);
    }
}