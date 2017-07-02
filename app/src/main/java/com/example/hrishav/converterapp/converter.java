package com.example.hrishav.converterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class converter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        final EditText temp=(EditText)findViewById(R.id.tempBox);
        final RadioButton cel2far=(RadioButton)findViewById(R.id.c2f);
        final RadioButton far2cel=(RadioButton)findViewById(R.id.f2c);
        final Button conn=(Button)findViewById(R.id.conBtn);

        final EditText editText3=(EditText)findViewById(R.id.editText3);

        conn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double kika = new Double(editText3.getText().toString());
                if (far2cel.isChecked())
                    kika = UnitConverter.forenhietToCelsius(kika);
                else
                    kika = UnitConverter.celsiusToForenhiet(kika);
                temp.setText(new Double(kika).toString());
            }
        });
    }
}
