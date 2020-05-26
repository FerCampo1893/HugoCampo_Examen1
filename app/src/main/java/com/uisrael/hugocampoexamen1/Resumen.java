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

        recibir=findViewById(R.id.etUsuario);
        nombreUsuario=findViewById(R.id.etNombre);
        montopagar=findViewById(R.id.etMonto);
        res1=findViewById(R.id.etPre1);
        res2=findViewById(R.id.etPre2);
        res3=findViewById(R.id.etPre3);

        datoRecibir=getIntent().getExtras();
        String recibirDatos=datoRecibir.getString("datoEnviado");
        String monto=datoRecibir.getString("monto");
        String nombre=datoRecibir.getString("nombre");
        String enviado1=datoRecibir.getString("enviado1");
        String enviado2=datoRecibir.getString("enviado2");
        String enviado3=datoRecibir.getString("enviado3");
        recibir.setText(recibirDatos);
        montopagar.setText(monto);
        nombreUsuario.setText(nombre);
        res1.setText(enviado1);
        res2.setText(enviado2);
        res3.setText(enviado3);

    }
}
