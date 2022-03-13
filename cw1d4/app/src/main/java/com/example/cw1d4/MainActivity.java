package com.example.cw1d4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button next = findViewById(R.id.button);
        EditText name1 = findViewById(R.id.name);
        EditText age1 = findViewById(R.id.age);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name1.getText().toString().isEmpty() || age1.getText().toString().isEmpty()){

                   // toast...
                    Toast.makeText(MainActivity.this, "please dont leave any filds impaty",Toast.LENGTH_LONG).show();

                }else {
                    String data = name1.getText().toString();
                    String ddata = age1.getText().toString();

                    Intent intent = new Intent(MainActivity.this , MainActivity2.class);
                    intent.putExtra("name", data);
                    intent.putExtra("age", ddata);
                    startActivity(intent);
                }


            }


        });



    }
}