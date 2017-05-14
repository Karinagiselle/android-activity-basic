package ar.com.ejemplo.androidinicial.android_inicial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DatosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datos_activity);

        Intent intent = getIntent();
        TextView nombre = (TextView) findViewById(R.id.nombreBienvenida);
        nombre.setText(intent.getStringExtra("nombre"));
    }
}
