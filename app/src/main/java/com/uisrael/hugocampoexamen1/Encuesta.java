package com.uisrael.hugocampoexamen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Encuesta extends AppCompatActivity {


    Bundle datoRecibir;
    StringBuffer radio=new StringBuffer();
    StringBuffer check= new StringBuffer();
    TextView recibir, usuario;
    EditText  preg1;
    String monto,nombre;
    RadioButton op1, op2;
    CheckBox cb1, cb2, cb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);
        // radiobutton
        op1 = findViewById(R.id.rbOp1);
        op2 = findViewById(R.id.rbOp2);

        //checkbutton
        cb1 = findViewById(R.id.cbOp1);
        cb2 = findViewById(R.id.cbOp2);
        cb3 = findViewById(R.id.cbOp3);
        //pregunta
        preg1 = findViewById(R.id.etRes1);

        recibir = findViewById(R.id.etUsuario);
        datoRecibir= getIntent().getExtras(); // obetengo el dato
        String RecibirDato = datoRecibir.getString("datoEnviado");
        recibir.setText(RecibirDato);//envio a la caja de texto

        monto=datoRecibir.getString("valor");
        nombre=datoRecibir.getString("nombreEstudiante");
    }
    public void guardarEncuesta(View v){
        Intent intentResumen= new Intent(Encuesta.this,Resumen.class);
        intentResumen.putExtra("datoEnviado",recibir.getText().toString());
        intentResumen.putExtra("valor",monto.toString());
        intentResumen.putExtra("nombreEstudiante",nombre.toString());
        if(cb1.isChecked()==true){
            check.append(cb1.getText().toString()).append(" - ");
        }
        if(cb2.isChecked()==true){
            check.append(cb2.getText().toString()).append(" - ");
        }

        if(cb3.isChecked()==true){
            check.append(cb3.getText().toString());
        }
        intentResumen.putExtra("enviado2",check.toString());
        if(op1.isChecked()==true){
            radio.append("SI");
        }
        if(op2.isChecked()==true){
            radio.append("NO");
        }
        intentResumen.putExtra("enviado3",radio.toString());
        intentResumen.putExtra("enviado1",preg1.getText().toString());
        startActivity(intentResumen);
    }
}
