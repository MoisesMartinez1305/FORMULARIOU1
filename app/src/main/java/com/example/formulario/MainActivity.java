package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText Nombre;
    private EditText Edad;
    private EditText Direccion;
    private EditText Escolaridad;
    private EditText Situacion;
    private EditText Hobbie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Nombre = findViewById(R.id.Nombre);
        Edad = findViewById(R.id.Edad);
        Direccion = findViewById(R.id.Direccion);
        Escolaridad = findViewById(R.id.Escuela);
        Situacion = findViewById(R.id.Senti);
        Hobbie = findViewById(R.id.Hobbie);
    }

    public void alta (View view){
        Intent v = new Intent(this,ventana2.class);
        v.putExtra("nombre",Nombre.getText().toString());
        v.putExtra("Edad",Edad.getText().toString());
        v.putExtra("Direccion",Direccion.getText().toString());
        v.putExtra("Escolaridad",Escolaridad.getText().toString());
        v.putExtra("Situacion",Situacion.getText().toString());
        v.putExtra("Hobbie",Hobbie.getText().toString());
        startActivity(v);
    }
    public void limpiar (View view){
        Nombre.setText("");
        Edad.setText("");
        Direccion.setText("");
        Escolaridad.setText("");
        Situacion.setText("");
        Hobbie.setText("");
    }
}