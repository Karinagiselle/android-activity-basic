package ar.com.ejemplo.androidinicial.android_inicial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

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
        TextView estadoPelicula = (TextView) findViewById(R.id.estadoPelicula);

        Boolean disponibilidad = disponibilidadPeliculas.get(pelicula);

        if (disponibilidad != null ) {
            estadoPelicula.setText(disponibilidad ? "Película disponible" : "Película no disponible");
        } else {
            estadoPelicula.setText("Error al cargar titulo");
        }
    }
}
