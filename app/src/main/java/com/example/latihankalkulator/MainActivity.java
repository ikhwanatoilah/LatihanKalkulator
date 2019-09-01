package com.example.latihankalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText vTextA,vTextB,vTextC;

    protected float yTextA,yTextB,yTextc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vTextA = (EditText)findViewById(R.id.txtA);
        vTextB = (EditText)findViewById(R.id.txtB);
        vTextC = (EditText)findViewById(R.id.txtC);

        Button vBtnTambah = (Button)findViewById(R.id.btnTambah);
        Button vBtnKurang = (Button)findViewById(R.id.btnKurang);
        Button vBtnKali = (Button)findViewById(R.id.btnKali);
        Button vBtnBagi = (Button)findViewById(R.id.btnBagi);

        vBtnBagi.setOnClickListener(this);
        vBtnTambah.setOnClickListener(this);
        vBtnKurang.setOnClickListener(this);
        vBtnKali.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        yTextA = Float.parseFloat(vTextA.getText().toString());
        yTextB = Float.parseFloat(vTextB.getText().toString());

        switch (view.getId()){
            case R.id.btnTambah:
                yTextc = yTextA + yTextB;

                vTextC.setText(Float.toString(yTextc));
                break;
            case R.id.btnKali:
                yTextc = yTextA * yTextB;

                vTextC.setText(Float.toString(yTextc));
                break;
            case R.id.btnKurang:
                yTextc = yTextA - yTextB;
                vTextC.setText(Float.toString(yTextc));
                break;
            case R.id.btnBagi:
                yTextc = yTextA / yTextB;

                vTextC.setText(Float.toString(yTextc));
                break;

        }
    }
}
