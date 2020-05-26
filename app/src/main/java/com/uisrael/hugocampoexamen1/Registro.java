package com.uisrael.hugocampoexamen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Registro extends AppCompatActivity {
    Bundle datoRecibir;
    TextView recibir;
    EditText cuota1, pagoInicial, totalPagar,nombre;
    Double valortotal=1800.00, inicial, cuota=0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        // calculo
        pagoInicial = findViewById(R.id.etMonto);
        cuota1 = findViewById(R.id.etPago);
        //totalPagar = findViewById(R.id.etCalculo);
        nombre= findViewById(R.id.etUsuario);
// usuario recibido
        recibir = findViewById(R.id.etUsuario);
        datoRecibir= getIntent().getExtras(); // obetengo el dato
        String RecibirDato = datoRecibir.getString("datoEnviado");
        recibir.setText(RecibirDato);//envio a la caja de texto


    }
    public void Cuota (View v){

        inicial= Double.parseDouble(pagoInicial.getText().toString());
        valortotal=(valortotal-inicial);
        cuota= (valortotal/3)*1.05;

        cuota1.setText(Double.toString(cuota));
    }

    public void Guardar (View v){
        Intent envio= new Intent(Registro.this,Encuesta.class);
        envio.putExtra("datoEnviado",recibir.getText().toString());
        envio.putExtra("monto",String.valueOf(valortotal));
        envio.putExtra("nombre",nombre.getText().toString());
        Toast.makeText(getApplicationContext(),"guardado con éxito.",Toast.LENGTH_SHORT).show();
        startActivity(envio);
    }


}
