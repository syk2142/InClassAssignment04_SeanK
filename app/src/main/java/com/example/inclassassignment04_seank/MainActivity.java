package com.example.inclassassignment04_seank;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mCopy, mDouble,mUp, mDown;
    int a =12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mCopy = (Button)findViewById(R.id.copy_button);
        mCopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView displayText= findViewById(R.id.textview);
                EditText editText = (EditText)findViewById(R.id.input_text_view);
                String inputText = editText.getText().toString();
                displayText.setText(inputText);
            }
        });
        mDouble =(Button)findViewById(R.id.double_button);
        mDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView displayText= findViewById(R.id.textview);
                String inputText = displayText.getText().toString();
                inputText = inputText+inputText;
                displayText.setText(inputText);
            }
        });
        mUp = (Button)findViewById(R.id.up_button);
        mUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView displayText= findViewById(R.id.textview);
                a =a +10;
                displayText.setTextSize(a);
            }
        });
        mDown = (Button) findViewById(R.id.down_button);
        mDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView displayText= findViewById(R.id.textview);
                a =a -5;
                displayText.setTextSize(a);
            }
        });

    }
    @Override
    public void onResume(){
        super.onResume();
        Toast.makeText(MainActivity.this, R.string.welcome_toast, Toast.LENGTH_SHORT).show();
    }
}