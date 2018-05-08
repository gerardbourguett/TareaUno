package com.example.gerard.tareauno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button act_uno = findViewById(R.id.act1);
        Button act_dos = findViewById(R.id.act2);
        Button act_tres = findViewById(R.id.act3);

        act_uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityUno.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Activity Uno", Toast.LENGTH_SHORT).show();
            }
        });

        act_dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityDos.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Activity Dos", Toast.LENGTH_SHORT).show();
            }
        });

        act_tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityTres.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Activity Tres", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
