package com.example.student.a1lab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    static String superString = "";
    static float firstnumber = 0;
    static int oper = 0;

    TextView tvRes;
    Button buttonA;
    Button buttonS;
    Button buttonM;
    Button buttonD;
    Button buttonP;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonCL;
    Button buttonQ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvRes = (TextView) findViewById(R.id.textView);
        buttonA = (Button) findViewById(R.id.buttonA);
        buttonS = (Button) findViewById(R.id.buttonS);
        buttonM = (Button) findViewById(R.id.buttonM);
        buttonD = (Button) findViewById(R.id.buttonD);
        buttonP = (Button) findViewById(R.id.buttonP);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonCL = (Button) findViewById(R.id.buttonCL);
        buttonQ = (Button) findViewById(R.id.buttonQ);

        buttonA.setOnClickListener(SuperClick);
        buttonS.setOnClickListener(SuperClick);
        buttonM.setOnClickListener(SuperClick);
        buttonD.setOnClickListener(SuperClick);
        button0.setOnClickListener(SuperClick);
        button1.setOnClickListener(SuperClick);
        button2.setOnClickListener(SuperClick);
        button3.setOnClickListener(SuperClick);
        button4.setOnClickListener(SuperClick);
        button5.setOnClickListener(SuperClick);
        button6.setOnClickListener(SuperClick);
        button7.setOnClickListener(SuperClick);
        button8.setOnClickListener(SuperClick);
        button9.setOnClickListener(SuperClick);
        buttonP.setOnClickListener(SuperClick);
        buttonQ.setOnClickListener(SuperClick);
        buttonCL.setOnClickListener(SuperClick);
        tvRes.setText(superString);
    }


    View.OnClickListener SuperClick=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button0 : superString += "0"; tvRes.setText(superString); break;
                case R.id.button1 : superString += "1"; tvRes.setText(superString); break;
                case R.id.button2 : superString += "2"; tvRes.setText(superString); break;
                case R.id.button3 : superString += "3"; tvRes.setText(superString); break;
                case R.id.button4 : superString += "4"; tvRes.setText(superString); break;
                case R.id.button5 : superString += "5"; tvRes.setText(superString); break;
                case R.id.button6 : superString += "6"; tvRes.setText(superString); break;
                case R.id.button7 : superString += "7"; tvRes.setText(superString); break;
                case R.id.button8 : superString += "8"; tvRes.setText(superString); break;
                case R.id.button9 : superString += "9"; tvRes.setText(superString); break;
                case R.id.buttonP : superString += "."; tvRes.setText(superString); break;
                case R.id.buttonA : oper = 1; firstnumber = Float.parseFloat(superString); superString = ""; tvRes.setText(superString); break;
                case R.id.buttonS : oper = 2; firstnumber = Float.parseFloat(superString); superString = ""; tvRes.setText(superString); break;
                case R.id.buttonM : oper = 3; firstnumber = Float.parseFloat(superString); superString = ""; tvRes.setText(superString); break;
                case R.id.buttonD : oper = 4; firstnumber = Float.parseFloat(superString); superString = ""; tvRes.setText(superString); break;
                case R.id.buttonCL : superString = ""; tvRes.setText(superString); break;
                case R.id.buttonQ : {
                    if (!superString.isEmpty())
                        switch (oper) {
                            case 0:
                                /* tvRes.setText("Error"); */
                                tvRes.setText(superString);
                                break;
                            case 1:
                                superString = String.valueOf(firstnumber + Float.parseFloat(superString));
                                tvRes.setText(superString);
                                oper = 0;
                                break;
                            case 2:
                                superString = String.valueOf(firstnumber - Float.parseFloat(superString));
                                tvRes.setText(superString);
                                oper = 0;
                                break;
                            case 3:
                                superString = String.valueOf(firstnumber * Float.parseFloat(superString));
                                tvRes.setText(superString);
                                oper = 0;
                                break;
                            case 4:
                                superString = String.valueOf(firstnumber / Float.parseFloat(superString));
                                tvRes.setText(superString);
                                oper = 0;
                                break;
                        }
                }

            }


        }
    };

}
