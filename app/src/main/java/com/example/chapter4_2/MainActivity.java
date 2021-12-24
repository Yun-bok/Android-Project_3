package com.example.chapter4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnMesgPrint ;
    TextView tvOutput;
    EditText edInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("문자열입력받아 출력하기");

        btnMesgPrint = (Button)findViewById(R.id.btnMesgPrint);
        edInput = (EditText)findViewById(R.id.edInput);
        tvOutput = (TextView)findViewById(R.id.tvOutput);

        btnMesgPrint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //위에서 받아서 아래로 출력
                String str = edInput.getText().toString();// +.toString() 문자열 변환
                tvOutput.setText("메시지: "+str); 
            }
        });


    }
}