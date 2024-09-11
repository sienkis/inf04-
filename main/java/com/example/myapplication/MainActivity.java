package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int x = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;


        });
        Button buton6 = findViewById(R.id.button6);
        buton6.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
            x++;
                TextView textView = (TextView) findViewById(R.id.textView2);
                textView.setText(x + " polubień");
            }

    });
        Button buton8 = findViewById(R.id.button8);
        buton8.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.textView2);
                if(x==0){
                    textView.setText("0 polubień");
                }else {
                    x--;

                    textView.setText(x + " polubień");
                }

            }

        });



}
}