package com.example.gerard.tareauno;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityUno extends AppCompatActivity implements FragUno.OnFragmentInteractionListener, FragDos.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uno);

        final EditText text1 = findViewById(R.id.enviar_act_uno);
        Button send_uno = findViewById(R.id.enviar1);
        final TextView salida = findViewById(R.id.pantalla);

        send_uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textToSend = text1.getText().toString();
                salida.setText("Activity 1: "+textToSend);
            }
        });


    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
