package com.example.hp.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int num=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.count);
        quantityTextView.setText("" + number);
    }

    public  void reset(View view)
    {
        num=0;
        display(num);
    }

    public void add(View view)
    {
        num++;
        display(num);
    }
    public void subtract(View view)
    {
        num--;
        display(num);
    }
}
