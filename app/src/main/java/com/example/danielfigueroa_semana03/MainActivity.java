package com.example.danielfigueroa_semana03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout Screen;
    private TextView TituloPrincipal;
    private EditText NombreUsuario;
    private Button BotonContinuar;
    private Button BotonConfig;
    public ConstraintLayout Fondo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referenciar
        Screen = findViewById(R.id.Fondo);
        TituloPrincipal = findViewById(R.id.TituloPrincipal);
        NombreUsuario = findViewById(R.id.NombreUsuario);
        BotonContinuar = findViewById(R.id.BotonContinuar);
        BotonConfig = findViewById(R.id.BotonConfig);
        Fondo = findViewById(R.id.Fondo);
        BotonContinuar.setOnClickListener(
                (v)->{
                    String username = NombreUsuario.getText().toString();
                    Intent i = new Intent(this, CalculoNotaActivity.class);
                    i.putExtra("Username",username); //mandando un elemento de una actividad ala otra
                    startActivity(i);
                }
        );
        BotonConfig.setOnClickListener(
                (v)->{
                    Intent i = new Intent(this, ConfiguracionColorActivity.class);
                    startActivity(i);
                }
        );

    }


   /* public void onClick(View m) {
        switch (m.getId()) {
            case R.id.BotonContinuar:
                String username = NombreUsuario.getText().toString();
                Toast.makeText(this, username + "", Toast.LENGTH_LONG).show();
                Intent i = new Intent(this, CalculoNotaActivity.class);
                startActivity(i);
                break;
        }
    }*/






}