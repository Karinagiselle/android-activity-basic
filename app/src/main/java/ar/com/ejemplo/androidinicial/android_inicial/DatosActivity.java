package ar.com.ejemplo.androidinicial.android_inicial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DatosActivity extends AppCompatActivity {

    private final static String MENSAJE_BIENVENIDA = "Bienvenido %s, usted va a recibir toda la " +
            "información de su equipo preferido %s";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datos_activity);

        Intent intent = getIntent();
        TextView nombre = (TextView) findViewById(R.id.nombreBienvenida);
        nombre.setText(String.format(MENSAJE_BIENVENIDA,intent.getStringExtra("nombre"), intent.getStringExtra("equipo")));
    }
}
