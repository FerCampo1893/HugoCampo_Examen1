package com.uisrael.hugocampoexamen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class Encuesta extends AppCompatActivity {
    Bundle usuarioRecibido;
    EditText recibir, pregunta2;
    RadioButton op1, op2,op3;
    CheckBox cb1, cb2, cb3;
    Button btnGuardar;
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
        pregunta2 = findViewById(R.id.etRes1);

        btnGuardar = findViewById(R.id.btnValidar);

        usuarioRecibido = getIntent().getExtras();
        String recibirDato = usuarioRecibido.getString("datoEnviado");
        recibir.setText(recibirDato);
    }
    public void Preguntas2(View v){
        Intent intentrespuestas2 = new Intent(this, Resumen.class);
        if(cb1.isChecked()==true){
            intentrespuestas2.putExtra("inteligencia", cb1.getText().toString());
        }
        if(cb2.isChecked()==true) {
            intentrespuestas2.putExtra("moviles", cb2.getText().toString());
        }
        if(cb3.isChecked()==true) {
            intentrespuestas2.putExtra("auditoria", cb3.getText().toString());
        }
        if(op1.isChecked()==true){
            intentrespuestas2.putExtra("seleccion1", op1.getText().toString());
        }
        if(op2.isChecked()==true){
            intentrespuestas2.putExtra("seleccion1", op2.getText().toString());
        }


        intentrespuestas2.putExtra("respuesta", pregunta2.getText().toString());
        startActivity(intentrespuestas2);

    }
}
