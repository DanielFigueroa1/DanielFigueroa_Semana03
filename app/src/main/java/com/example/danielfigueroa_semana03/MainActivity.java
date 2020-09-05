package com.example.danielfigueroa_semana03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
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
    SharedPreferences sharedPreferences;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //String fondo = getIntent().getExtras().getString(Fondo);

        //referenciar
        Screen = findViewById(R.id.Fondo);
        TituloPrincipal = findViewById(R.id.TituloPrincipal);
        NombreUsuario = findViewById(R.id.NombreUsuario);
        BotonContinuar = findViewById(R.id.BotonContinuar);
        BotonConfig = findViewById(R.id.BotonConfig);
        Fondo = findViewById(R.id.Fondo);


        sharedPreferences = getSharedPreferences("Preferencias", MODE_PRIVATE);
        cambiarColor();


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

    public void cambiarColor(){ //aqui selecciona entre los casos de shared prefences
        int color = sharedPreferences.getInt("color", 0);
        switch(color){
            case 1: Fondo.setBackgroundColor(Color.CYAN);
                break;
            case 2: Fondo.setBackgroundColor(Color.YELLOW);
                break;
            case 3: Fondo.setBackgroundColor(Color.RED);
                break;
        }
    }




}