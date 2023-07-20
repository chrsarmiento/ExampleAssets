package com.desafiolatam.assetsprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre;
    private Button btnSaludar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = findViewById(R.id.txtNombre);
        btnSaludar = findViewById(R.id.btnSaludar);

        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = txtNombre.getText().toString().trim();
                if ( nombre.length() > 0){
                    Toast.makeText(MainActivity.this,"Hola " + nombre, Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"Debes ingresar tu nombre!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}