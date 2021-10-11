package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgview; //comment for test push

    public void addFunc(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText myTextField2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        int in1 = Integer.parseInt(myTextField1.getText().toString());
        int in2 = Integer.parseInt(myTextField2.getText().toString());
        String str = String.valueOf(in1 + in2);
        goToActivity2(str);
    }
    public void subFunc(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText myTextField2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        int in1 = Integer.parseInt(myTextField1.getText().toString());
        int in2 = Integer.parseInt(myTextField2.getText().toString());
        String str = String.valueOf(in1 - in2);
        goToActivity2(str);

    }
    public void multFunc(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText myTextField2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        int in1 = Integer.parseInt(myTextField1.getText().toString());
        int in2 = Integer.parseInt(myTextField2.getText().toString());
        String str = String.valueOf(in1 * in2);
        goToActivity2(str);

    }
    public void divFunc(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText myTextField2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        int in1 = Integer.parseInt(myTextField1.getText().toString());
        int in2 = Integer.parseInt(myTextField2.getText().toString());
        String str = String.valueOf(in1 / in2);
        goToActivity2(str);

    }

    public void goToActivity2(String s){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}