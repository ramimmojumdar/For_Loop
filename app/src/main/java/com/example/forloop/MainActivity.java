package com.example.forloop;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;

    TextView tvDisplay;

    AppCompatButton btn;

//    LinearLayout layout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        layout = findViewById(R.id.layout);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        tvDisplay = findViewById(R.id.tvDisplay);
        btn = findViewById(R.id.btn);




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvDisplay.setText("");

                String myString1 = editText1.getText().toString();
                String myString2 = editText2.getText().toString();

                int a = Integer.parseInt(myString1);
                int b = Integer.parseInt(myString2);

                for( int x = a; x<=b; x++ ){
                    if( x%2 == 0){
                        tvDisplay.append(" "+x);
                        tvDisplay.setVisibility(View.VISIBLE);
                    }else {
                        tvDisplay.setVisibility(View.INVISIBLE);
                    }

                }

            }
        });




//        for(int x = 1; x<=10; x++){
//
//            Button button = new Button(MainActivity.this);
//            button.setText("Button "+x);
//            layout.addView(button);
//
//
//        }

    }
}