package com4it.example.benre.castroaugustinelab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    Button txtbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Content Unavailable", Toast.LENGTH_SHORT).show();
                Log.d("LIFECYCLE", "onCreate(): was called");
            }
        });

        txtbtn = (Button)findViewById(R.id.button2);
        txtbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Snackbar.make(view,"Hello snack",Snackbar.LENGTH_LONG)
                        .setAction("Action",null).show();
            }
        });
    }
}

