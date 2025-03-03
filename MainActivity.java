package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView historyText, mainText;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8 , btn9;
    Button btnC, btnAC, btnDot, btnEqual, btnPlus, btnMinus, btnMulti, btnDiv, btnMod, btnPlusMinus;
    float value1, value2, toplam;
    boolean plus, minus, div, mod, multi, isNewCalculation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        historyText = findViewById(R.id.historyText);
        mainText = findViewById(R.id.mainText);

        historyText.setText(null);
        mainText.setText(null);

        toplam = 0;
        plus = false;
        minus = false;
        div = false;
        multi = false;
        mod = false;
        isNewCalculation = true;

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnC = findViewById(R.id.btnC);
        btnAC = findViewById(R.id.btnAC);
        btnDot = findViewById(R.id.btnDot);
        btnEqual = findViewById(R.id.btnEqual);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMulti = findViewById(R.id.btnMulti);
        btnDiv = findViewById(R.id.btnDiv);
        btnMod = findViewById(R.id.btnMod);
        btnPlusMinus = findViewById(R.id.btnPlusMinus);

        btnPlusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mainText.getText().toString().isEmpty()) {
                    float currentValue = Float.parseFloat(mainText.getText().toString());
                    mainText.setText(String.valueOf(-currentValue));
                }
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainText.setText(mainText.getText()+"0");
                historyText.setText(mainText.getText());
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainText.setText(mainText.getText()+"1");
                historyText.setText(mainText.getText());
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainText.setText(mainText.getText()+"2");
                historyText.setText(mainText.getText());
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainText.setText(mainText.getText()+"3");
                historyText.setText(mainText.getText());
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainText.setText(mainText.getText()+"4");
                historyText.setText(mainText.getText());
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainText.setText(mainText.getText()+"5");
                historyText.setText(mainText.getText());
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainText.setText(mainText.getText()+"6");
                historyText.setText(mainText.getText());
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainText.setText(mainText.getText()+"7");
                historyText.setText(mainText.getText());
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainText.setText(mainText.getText()+"8");
                historyText.setText(mainText.getText());
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainText.setText(mainText.getText()+"9");
                historyText.setText(mainText.getText());
            }
        });

        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainText.setText(null);
                historyText.setText(null);
                value1 = 0;
                value2 = 0;
                toplam = 0;
                plus = false;
                minus = false;
                div = false;
                multi = false;
                mod = false;
                isNewCalculation = false; // Yeniden başlatılan hesaplamaları durdur
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainText.setText(mainText.getText()+".");
                historyText.setText(mainText.getText());
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mainText.getText().toString().isEmpty()) { // Değer girilmiş mi kontrolü
                    if (isNewCalculation) {
                        btnEqual.performClick();
                    }

                    value1 = Float.parseFloat(mainText.getText().toString());
                    plus = true;
                    historyText.setText(value1 + " + ");
                    mainText.setText(null);
                    isNewCalculation = true;
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mainText.getText().toString().isEmpty()) {
                    if (isNewCalculation) {
                        btnEqual.performClick();
                    }

                    value1 = Float.parseFloat(mainText.getText().toString());
                    minus = true;
                    historyText.setText(value1 + " - ");
                    mainText.setText(null);
                    isNewCalculation = true;
                }
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mainText.getText().toString().isEmpty()) {
                    if (isNewCalculation) {
                        btnEqual.performClick();
                    }

                    value1 = Float.parseFloat(mainText.getText().toString());
                    multi = true;
                    historyText.setText(value1 + " x ");
                    mainText.setText(null);
                    isNewCalculation = true;
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mainText.getText().toString().isEmpty()) {
                    if (isNewCalculation) {
                        btnEqual.performClick();
                    }

                    value1 = Float.parseFloat(mainText.getText().toString());
                    div = true;
                    historyText.setText(value1 + " / ");
                    mainText.setText(null);
                    isNewCalculation = true;
                }
            }
        });

        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mainText.getText().toString().isEmpty()) {
                    if (isNewCalculation) {
                        btnEqual.performClick();
                    }

                    value1 = Float.parseFloat(mainText.getText().toString());
                    mod = true;
                    historyText.setText(value1 + " % ");
                    mainText.setText(null);
                    isNewCalculation = true;
                }
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainText.setText(null);
                isNewCalculation = false;
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!mainText.getText().toString().isEmpty()) {
                    value2 = Float.parseFloat(mainText.getText().toString());

                    if (plus) {
                        toplam = value1 + value2;
                        mainText.setText(toplam + "");
                        historyText.setText(value1 + " + " + value2);
                        plus = false;
                    } else if (minus) {
                        mainText.setText(value1 - value2 + "");
                        historyText.setText(value1 + " - " + value2);
                        minus = false;
                    } else if (multi) {
                        mainText.setText(value1 * value2 + "");
                        historyText.setText(value1 + " x " + value2);
                        multi = false;
                    } else if (div) {
                        if ((int) value2 == 0) {
                            mainText.setText("ERROR");
                            historyText.setText(null);
                            div = false;
                        } else {
                            mainText.setText(value1 / value2 + "");
                            historyText.setText(value1 + " / " + value2);
                            div = false;
                        }
                    } else if (mod) {
                        mainText.setText(value1 % value2 + "");
                        historyText.setText(value1 + " % " + value2);
                        mod = false;
                    }

                    value1 = toplam;
                    value2 = 0;
                    isNewCalculation = false;
                }
            }
        });

    }
}