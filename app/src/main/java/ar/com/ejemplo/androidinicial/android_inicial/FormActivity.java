package ar.com.ejemplo.androidinicial.android_inicial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        Button botonSubmit = (Button) findViewById(R.id.botonSubmit);
        botonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nombre = ((EditText) findViewById(R.id.nombreText)).getText().toString();
                String edad = ((EditText) findViewById(R.id.edadText)).getText().toString();

                if (camposCompletos(nombre, edad)) {
                    Intent intent = new Intent(getApplicationContext(), DatosActivity.class);
                    intent.putExtra("nombre", nombre);
                    startActivity(intent);
                }
            }
        });
    }

    private boolean camposCompletos(String nombre, String edad) {

        boolean camposCompletos = true;

        if (nombre.isEmpty() || edad.isEmpty()) {
            camposCompletos = false;
        }
        return camposCompletos;
    }

}
