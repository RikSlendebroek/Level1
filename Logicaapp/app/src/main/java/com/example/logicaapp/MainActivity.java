package com.example.logicaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Switch mSwitch1;
    private Switch mSwitch2;
    private Switch mSwitch3;
    private Switch mSwitch4;

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSwitch1 = findViewById(R.id.switch1);
        mSwitch2 = findViewById(R.id.switch2);
        mSwitch3 = findViewById(R.id.switch3);
        mSwitch4 = findViewById(R.id.switch4);

        mButton = findViewById(R.id.submit);


        mButton.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                checkAnswer();
            }
        });
    }

    private void showResult(boolean correct) {

        String message;

        if (correct) {

            message = "Great";

        } else {
            message = "Wrong";
        }

        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();

    }

    private void checkAnswer() {
        if (mSwitch1.isChecked()
                || !mSwitch2.isChecked()
                || mSwitch3.isChecked()
                || mSwitch4.isChecked()

        ) {
            showResult(false);
            return;
        }
        showResult(true);
    }
}
