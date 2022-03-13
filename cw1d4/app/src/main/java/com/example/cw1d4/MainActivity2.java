package com.example.cw1d4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView text = findViewById(R.id.myname);
        TextView text2 = findViewById(R.id.myage);
        Button rest = findViewById(R.id.button3);

        EditText name1 = findViewById(R.id.name);
        EditText age1 = findViewById(R.id.age);


        Bundle bundle = getIntent().getExtras();

        String finall = bundle.getString("name");
        String finall2 = bundle.getString("age");


        text.setText(finall);
        text2.setText(finall2);

        rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });





    }
}