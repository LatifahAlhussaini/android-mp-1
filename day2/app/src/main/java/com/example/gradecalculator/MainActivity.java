package com.example.gradecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText A = findViewById(R.id.quiz);
        final EditText B = findViewById(R.id.homework);
        final EditText C = findViewById(R.id.midterm);
        final EditText D = findViewById(R.id.finalexam);
        Button E = findViewById(R.id.calculate);
        final TextView F = findViewById(R.id.result);
        Button J = findViewById(R.id.reset);


        E.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String Q = A.getText().toString();
                double q = Double.parseDouble(Q);

//                if( q > 15 )
//                    Toast.makeText(MainActivity.this, " incorrect data ", Toast.LENGTH_LONG).show();


                String HW = B.getText().toString();
                double hw = Double.parseDouble(HW);

//                if( hw > 25 )
//                    Toast.makeText(MainActivity.this, " incorrect data ", Toast.LENGTH_LONG).show();

                String M = C.getText().toString();
                double m = Double.parseDouble(M);

//                if( m > 30 )
//                    Toast.makeText(MainActivity.this, " incorrect data ", Toast.LENGTH_LONG).show();

                String FE = D.getText().toString();
                double fe = Double.parseDouble(FE);

//                if( fe > 30 )
//                    Toast.makeText(MainActivity.this, " incorrect data ", Toast.LENGTH_LONG).show();


                double R = q + hw + m + fe ;


                if (R >= 90 && R <= 100){
                    F.setText("A");
                    Toast.makeText(MainActivity.this," excellent ",Toast.LENGTH_LONG).show();
                    F.setTextColor(Color.BLUE);
                }else if (R >= 80 && R <= 89){
                    F.setText("B");
                    Toast.makeText(MainActivity.this," very good ",Toast.LENGTH_LONG).show();
                    F.setTextColor(Color.GREEN);
                }else if (R >= 70 && R <= 79){
                    F.setText("C");
                    Toast.makeText(MainActivity.this," good ",Toast.LENGTH_LONG).show();
                    F.setTextColor(Color.YELLOW);
                }else if (R >= 60 && R <= 69) {
                    F.setText("D");
                    Toast.makeText(MainActivity.this, " not bad ", Toast.LENGTH_LONG).show();
                    F.setTextColor(Color.RED);
                }else if (R < 60){
                    F.setText("F");
                    Toast.makeText(MainActivity.this, " OOOOPS ", Toast.LENGTH_LONG).show();
                    F.setTextColor(Color.DKGRAY);
                }else {
                    F.setText("");
                    for(int x=1 ; x<3 ; x++)
                    Toast.makeText(MainActivity.this, " incorrect data ", Toast.LENGTH_LONG).show();


                }
            }
        });


        J.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                A.setText("");
                B.setText("");
                C.setText("");
                D.setText("");
                F.setText("");
            }
        });
    }
}