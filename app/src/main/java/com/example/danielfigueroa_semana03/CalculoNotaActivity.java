package com.example.danielfigueroa_semana03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CalculoNotaActivity extends AppCompatActivity {



    private EditText Pparcial1;
    private EditText Pparcial2;
    private EditText Quices;
    private EditText Parcial1;
    private EditText Parcial2;
    private EditText EjercicioSemanal;
    private Button BotonCalcular;
    public ConstraintLayout Fondo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_nota);
        Fondo = findViewById(R.id.Fondo);

        Pparcial1 = findViewById(R.id.Pparcial1);
        Pparcial2 = findViewById(R.id.PParcial2);
        Quices = findViewById(R.id.Quices);
        Parcial1 = findViewById(R.id.Parcial1);
        Parcial2 = findViewById(R.id.Parcial2);
        BotonCalcular = findViewById(R.id.BotonCalcular);
        EjercicioSemanal = findViewById(R.id.EjercicioSemanal);


        BotonCalcular.setOnClickListener(
                (v)->{

                    double pparcial1 = Double.parseDouble(Pparcial1.getText().toString()); //parcial 1 = lo que se ponga en Parcial1 y tiene que ser un numero
                    double pparcial2 = Double.parseDouble(Pparcial2.getText().toString());
                    double quices = Double.parseDouble(Quices.getText().toString());
                    double parcial1 = Double.parseDouble(Parcial1.getText().toString());
                    double parcial2 = Double.parseDouble(Parcial2.getText().toString());
                    double ejercicioSemanal = Double.parseDouble(EjercicioSemanal.getText().toString());
                    double resultado = ((pparcial1*0.25)+(pparcial2*0.25)+(quices*0.15)+(parcial1*0.15)+(parcial2*0.15)+(ejercicioSemanal*0.05));
                    Intent i = new Intent(this, ResultadoActivity.class);

                    Intent Activity = getIntent(); //esta actividad
                    String username = Activity.getStringExtra("username");
                    i.putExtra("Username",username);
                    i.putExtra("resultado",resultado); //mandando un elemento de una actividad ala otra

                    startActivity(i);
                }
        );
    }


}