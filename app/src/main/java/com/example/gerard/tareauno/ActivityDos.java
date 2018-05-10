package com.example.gerard.tareauno;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityDos extends AppCompatActivity implements FragUno.OnFragmentInteractionListener, FragTres.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);

        final EditText text2 = findViewById(R.id.enviar_act_dos);
        Button send_dos = findViewById(R.id.enviar2);
        final TextView salida = findViewById(R.id.pantalla);

        send_dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textToSend = text2.getText().toString();
                salida.setText("Activity 2: "+textToSend);
            }
        });
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
