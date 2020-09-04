package com.example.danielfigueroa_semana03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

public class ConfiguracionColorActivity extends AppCompatActivity {

    private Button BotonColor1;
    private Button BotonColor2;
    private Button BotonColor3;
    public ConstraintLayout Fondo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion_color);

        Fondo = findViewById(R.id.Fondo);
        BotonColor1 = findViewById(R.id.BotonColor1);
        BotonColor2 = findViewById(R.id.BotonColor2);
        BotonColor3 = findViewById(R.id.BotonColor3);

        BotonColor1.setOnClickListener(
                (v)->{
                    Fondo.setBackgroundColor(Color.CYAN);
                }
        );

        BotonColor2.setOnClickListener(
                (v)->{
                    Fondo.setBackgroundColor(Color.YELLOW);
                }
        );

        BotonColor3.setOnClickListener(
                (v)->{
                    Fondo.setBackgroundColor(Color.RED);
                }
        );

        BotonColor1.setOnClickListener(
                (v)->{
                    Intent i = new Intent(this, MainActivity.class);
                    startActivity(i);
                }
        );

        BotonColor2.setOnClickListener(
                (v)->{
                    Intent i = new Intent(this, MainActivity.class);
                    startActivity(i);
                }
        );

        BotonColor3.setOnClickListener(
                (v)->{
                    Intent i = new Intent(this, MainActivity.class);
                    startActivity(i);
                }
        );

    }
}