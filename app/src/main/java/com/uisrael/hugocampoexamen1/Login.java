package com.uisrael.hugocampoexamen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText etUsuario1, etPass;
    Button btnIng;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUsuario1 = (EditText) findViewById(R.id.etUsuario);
        etPass = (EditText) findViewById(R.id.etPassW);
        btnIng = (Button) findViewById(R.id.btnIngresar);
    }
    public void ingresar(View v){
        String nombre = etUsuario1.getText().toString();
        String password = etPass.getText().toString();
        //validar usuario y contraseña
        if(nombre.equals("estudiante2020") && password.equals("uisrael2020")) {
            Intent intentIngreso = new Intent(this, Registro.class);
            intentIngreso.putExtra("datoEnviado", etUsuario1.getText().toString());
            Toast.makeText(getApplicationContext(),"Ingresando", Toast.LENGTH_LONG).show();
            startActivity(intentIngreso);
        }
        else{

            Toast.makeText(getApplicationContext(),"Usuario o Clave Incorrecto", Toast.LENGTH_LONG).show();
        }
    }
}
