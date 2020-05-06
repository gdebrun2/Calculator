package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;

import android.os.Bundle;

import android.os.VibrationEffect;

import android.view.View;

import android.widget.Button;

import android.widget.ImageButton;

import android.widget.EditText;

import android.media.MediaPlayer;

import android.os.Vibrator;

public class MainActivity extends AppCompatActivity {

    Button one, two, three, four, five, six, seven, eight, nine, zero,
        multiply, add, subtract, divide, clear, equals, decimal;

    ImageButton backspace;

    EditText edit;

    MediaPlayer clicks;

    float valueOne, valueTwo;

    boolean addition, subtraction, multiplication, division;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clicks = MediaPlayer.create(this, R.raw.click);
        final Vibrator vibrate = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrate.vibrate(VibrationEffect.EFFECT_CLICK);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        decimal = (Button) findViewById(R.id.decimal);
        add = (Button) findViewById(R.id.add);
        subtract = (Button) findViewById(R.id.subtract);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        clear = (Button) findViewById(R.id.clear);
        equals = (Button) findViewById(R.id.equals);
        backspace = (ImageButton) findViewById(R.id.backspace);
        edit = (EditText) findViewById(R.id.editText);

        one.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                edit.setText(edit.getText() + "1");
                clicks.start();
                vibrate.vibrate(VibrationEffect.EFFECT_CLICK);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                edit.setText(edit.getText() + "2");
                clicks.start();
                vibrate.vibrate(VibrationEffect.EFFECT_CLICK);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                edit.setText(edit.getText() + "3");
                clicks.start();
                vibrate.vibrate(VibrationEffect.EFFECT_CLICK);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                edit.setText(edit.getText() + "4");
                clicks.start();
                vibrate.vibrate(VibrationEffect.EFFECT_CLICK);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                edit.setText(edit.getText() + "5");
                clicks.start();
                vibrate.vibrate(VibrationEffect.EFFECT_CLICK);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                edit.setText(edit.getText() + "6");
                clicks.start();
                vibrate.vibrate(VibrationEffect.EFFECT_CLICK);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                edit.setText(edit.getText() + "7");
                clicks.start();
                vibrate.vibrate(VibrationEffect.EFFECT_CLICK);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                edit.setText(edit.getText() + "8");
                clicks.start();
                vibrate.vibrate(VibrationEffect.EFFECT_CLICK);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                edit.setText(edit.getText() + "9");
                clicks.start();
                vibrate.vibrate(VibrationEffect.EFFECT_CLICK);
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                edit.setText(edit.getText() + "0");
                clicks.start();
                vibrate.vibrate(VibrationEffect.EFFECT_CLICK);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                edit.setText("");
                clicks.start();
                vibrate.vibrate(VibrationEffect.EFFECT_CLICK);
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (edit.getText() != null && !edit.getText().toString().contains(".")) {
                    edit.setText(edit.getText() + ".");
                }
                clicks.start();
                vibrate.vibrate(VibrationEffect.EFFECT_CLICK);
            }
        });

        backspace.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (edit.getText() != null && edit.getText().length() > 0) {
                    edit.setText(edit.getText().subSequence(0, edit.getText().length() - 1));
                }
                clicks.start();
                vibrate.vibrate(VibrationEffect.EFFECT_CLICK);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (edit.getText() != null && edit.getText().length() > 0) {
                    valueOne = Float.parseFloat(edit.getText() + "");
                }
                addition = true;
                edit.setText(null);
                clicks.start();
                vibrate.vibrate(VibrationEffect.EFFECT_CLICK);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (edit.getText() != null && edit.getText().length() > 0) {
                    valueOne = Float.parseFloat(edit.getText() + "");
                }
                subtraction = true;
                edit.setText(null);
                clicks.start();
                vibrate.vibrate(VibrationEffect.EFFECT_CLICK);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (edit.getText() != null && edit.getText().length() > 0) {
                    valueOne = Float.parseFloat(edit.getText() + "");
                }
                multiplication = true;
                edit.setText(null);
                clicks.start();
                vibrate.vibrate(VibrationEffect.EFFECT_CLICK);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (edit.getText() != null && edit.getText().length() > 0) {
                    valueOne = Float.parseFloat(edit.getText() + "");
                }
                division = true;
                edit.setText(null);
                clicks.start();
                vibrate.vibrate(VibrationEffect.EFFECT_CLICK);
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (edit.getText() != null && edit.getText().length() > 0) {
                    valueTwo = Float.parseFloat(edit.getText() + "");
                }
                if (addition) {
                    edit.setText(valueOne + valueTwo + "");
                    addition = false;
                } else if (subtraction) {
                    edit.setText(valueOne - valueTwo + "");
                    subtraction = false;
                } else if (multiplication) {
                    edit.setText(valueOne * valueTwo + "");
                    multiplication = false;
                } else if (division) {
                    edit.setText(valueOne / valueTwo + "");
                    division = false;
                }
                clicks.start();
                vibrate.vibrate(VibrationEffect.EFFECT_CLICK);
            }
        });
    }
}
