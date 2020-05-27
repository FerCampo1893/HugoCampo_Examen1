package com.uisrael.hugocampoexamen1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Resumen extends AppCompatActivity {
    Bundle datoRecibir;
    TextView recibir, montopagar, nombreUsuario, res1, res2, res3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);

        nombreUsuario=findViewById(R.id.etNombre);
        montopagar=findViewById(R.id.etMonto);
        res1=findViewById(R.id.etPre1);
        res2=findViewById(R.id.etPre2);
        res3=findViewById(R.id.etPre3);
        recibir = findViewById(R.id.etUsuario);
        datoRecibir=getIntent().getExtras();
        String recibirDatos=datoRecibir.getString("datoEnviado");
        String valor=datoRecibir.getString("valor");
        String estudiante=datoRecibir.getString("nombreEstudiante");
        String preg1=datoRecibir.getString("enviado1");
        String check=datoRecibir.getString("enviado2");
        String radio=datoRecibir.getString("enviado3");
        recibir.setText(recibirDatos);
        montopagar.setText(valor);
        nombreUsuario.setText(estudiante);
        res1.setText(preg1);
        res2.setText(check);
        res3.setText(radio);

    }
}
