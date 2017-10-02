package com.example.android.binhexdecoctconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText bin,hex,dec,oct;
    Button binButton,hexButton,decButton,octButton,convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bin=(EditText)findViewById(R.id.bin);
        hex=(EditText)findViewById(R.id.hex);
        dec=(EditText)findViewById(R.id.dec);
        oct=(EditText)findViewById(R.id.oct);

        binButton=(Button)findViewById(R.id.binButton);
        decButton=(Button)findViewById(R.id.decButton);
        octButton=(Button)findViewById(R.id.octButton);
        hexButton=(Button)findViewById(R.id.hexButton);

        convert=(Button)findViewById(R.id.convertButton);

        






    }
}
