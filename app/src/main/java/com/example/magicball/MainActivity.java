package com.example.magicball;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView BallI;
    private TextView respuesta;
    private TextView titulo;

    private Typeface Rosttel;

    private String[] respuestaArray ={"Es cierto", "Definitivamente es así", "Sin duda", "Sí definitivamente", "Puede confiar en él", "Como yo lo veo, sí",
            "Lo más probable", "Perspectiva buena", "Sí", "Las señales apuntan a sí", "Respuesta confusa intente de nuevo", "Pregunte de nuevo más tarde",
            "Mejor no decirte ahora", "No puedo predecir ahora", "Concéntrate y pregunta de nuevo", "No cuentes con eso",
            "Mi respuesta es no", "Mis fuentes dicen que no", "Outlook no es tan bueno", "Muy dudoso", "El COVID-19 no esta en usted", "Se mejorara pronto"};

    @Override
       protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         String Fuente1 = "Fuentes/Rosttel.otf";
         this.Rosttel = Typeface.createFromAsset(getAssets(),Fuente1);

         titulo = (TextView) findViewById(R.id.titulo);
         titulo.setTypeface(Rosttel);
        respuesta = (TextView) findViewById(R.id.respuesta);
        respuesta.setTypeface(Rosttel);

         BallI =findViewById(R.id.boton);

         respuesta = findViewById(R.id.respuesta);

         BallI.setOnClickListener(this);
         Toast.makeText( MainActivity.this, "Buscando destino", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.boton:
                int random = new Random().nextInt(respuestaArray.length);
                respuesta.setText(respuestaArray[random]);

                break;
        }
    }

}

