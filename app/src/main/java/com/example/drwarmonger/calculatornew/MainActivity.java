package com.example.drwarmonger.calculatornew;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
    private Button bAdd,bSub;
    private TextView result;
    private EditText editText1,editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        bAdd = (Button)findViewById(R.id.button1);
        bSub = (Button)findViewById(R.id.button2);
        editText1 = (EditText)findViewById(R.id.editText2);
        editText2 = (EditText)findViewById(R.id.editText);
        result = (TextView)findViewById(R.id.editText3);

        bAdd.setOnClickListener(this);
        bSub.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        String num1 = editText1.getText().toString();
        String num2 = editText2.getText().toString();
        switch(view.getId()){
            case R.id.button1:
                int addition = Integer.parseInt(num1) + Integer.parseInt(num2);
                result.setText(String.valueOf(addition));
                break;
            case R.id.button2:
                int subtraction = Integer.parseInt(num1) - Integer.parseInt(num2);
                result.setText(String.valueOf(subtraction));
                break;
        }
    }
}