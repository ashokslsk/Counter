package com.ashokslsk.counter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private TextView mText;
    private Button mButton;
    int counter = 0;
    private EditText mEditText;
    private String mUsername = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mText = (TextView) findViewById(R.id.mJapa);
        mButton = (Button) findViewById(R.id.japaClick);
        mEditText = (EditText) findViewById(R.id.name);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mUsername=mEditText.getText().toString();
                if(mUsername.isEmpty()){

                    Toast.makeText(MainActivity.this, "Please enter your name`", Toast.LENGTH_SHORT).show();

                }else{
                    counter++;
                    mText.setText(mUsername+" "+"Clicking "+counter+" Many times");
                }



            }
        });
    }
}
