package com.example.danielfigueroa_semana03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

public class ConfiguracionColorActivity extends AppCompatActivity {

    private Button BotonColor1;
    private Button BotonColor2;
    private Button BotonColor3;
    public ConstraintLayout Fondo;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion_color);

        Fondo = findViewById(R.id.Fondo);
        BotonColor1 = findViewById(R.id.BotonColor1);
        BotonColor2 = findViewById(R.id.BotonColor2);
        BotonColor3 = findViewById(R.id.BotonColor3);

        sharedPreferences = getSharedPreferences("Preferencias", MODE_PRIVATE); //en este caso seria la info de los colores

        BotonColor1.setOnClickListener(
                (v)->{

                    sharedPreferences.edit().putInt("color", 1).apply();
                    cambiarColor(); //se pone asi porque el metodo esta abajo
                    Intent i = new Intent(this, MainActivity.class);
                    startActivity(i);

                }
        );

        BotonColor2.setOnClickListener(
                (v)->{

                    sharedPreferences.edit().putInt("color", 2).apply();
                    cambiarColor();
                    Intent i = new Intent(this, MainActivity.class);
                    startActivity(i);
                }
        );

        BotonColor3.setOnClickListener(
                (v)->{

                    sharedPreferences.edit().putInt("color", 3).apply();
                    cambiarColor();
                    Intent i = new Intent(this, MainActivity.class);
                    startActivity(i);
                }
        );


    }

    @Override
    protected void onResume() {
        super.onResume();
        cambiarColor();//que haga el cambiar color incluso cuando se devuelva de pantalla
    }

    public void cambiarColor(){ //aqui selecciona entre los casos de shared prefences y este seria un metodo
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