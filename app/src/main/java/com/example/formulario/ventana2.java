package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ventana2 extends AppCompatActivity {
    private TextView Nombre2;
    private TextView Edad2;
    private TextView Direccion2;
    private TextView Escolaridad2;
    private TextView Situacion2;
    private TextView Hobbie2;
    Bundle datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2);
        Nombre2 = findViewById(R.id.Nombre2);
        Edad2 = findViewById(R.id.Edad2);
        Direccion2 = findViewById(R.id.Direccion2);
        Escolaridad2 = findViewById(R.id.Escolaridad2);
        Situacion2 = findViewById(R.id.Senti2);
        Hobbie2 = findViewById(R.id.Hobbie2);
        datos = getIntent().getExtras();
        Nombre2.setText(""+datos.getString("nombre"));
        Edad2.setText(""+datos.getString("Edad"));
        Direccion2.setText(""+datos.getString("Direccion"));
        Escolaridad2.setText(""+datos.getString("Escolaridad"));
        Situacion2.setText(""+datos.getString("Situacion"));
        Hobbie2.setText(""+datos.getString("Hobbie"));
    }

    public void click2 (View view){
        finish();
    }

    public void limpiar2 (View view){
        Nombre2.setText("");
        Edad2.setText("");
        Direccion2.setText("");
        Escolaridad2.setText("");
        Situacion2.setText("");
        Hobbie2.setText("");
    }

}