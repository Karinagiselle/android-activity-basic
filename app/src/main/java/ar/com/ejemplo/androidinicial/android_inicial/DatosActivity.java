package ar.com.ejemplo.androidinicial.android_inicial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.HashMap;

public class DatosActivity extends AppCompatActivity {

    private final static HashMap<String, Boolean> disponibilidadPeliculas;
    static {
        disponibilidadPeliculas = new HashMap<>();
        disponibilidadPeliculas.put("matrix", true);
        disponibilidadPeliculas.put("shrek", true);
        disponibilidadPeliculas.put("dracula", false);
        disponibilidadPeliculas.put("los simpsons", true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datos_activity);

        String pelicula = getIntent().getStringExtra("pelicula");

        Boolean disponibilidad = disponibilidadPeliculas.get(pelicula);
        final TextView grupo = new TextView(DatosActivity.this);
        grupo.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        LinearLayout mainLayout = (LinearLayout) findViewById(R.id.peliculaDisponible);

        if (disponibilidad != null ) {
            grupo.setText(disponibilidad ? "Esta disponible" : "No esta disponible");
        } else {
            grupo.setText("Error al cargar titulo");
        }
        mainLayout.addView(grupo);
    }
}
