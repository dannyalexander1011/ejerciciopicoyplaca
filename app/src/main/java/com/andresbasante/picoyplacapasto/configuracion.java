package com.andresbasante.picoyplacapasto;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class configuracion extends AppCompatActivity {

    Spinner lista;
    String[] datos = {"0 - 1","2 - 3","4 - 5", "6 - 7","8 - 9"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);
        lista = (Spinner) findViewById(R.id.lista);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos);
        lista.setAdapter(adaptador);

        lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                switch (i)
                {
                    case 1:
                        Toast to = Toast.makeText(getApplicationContext(),datos[i], Toast.LENGTH_LONG);
                        to.show();
                        break;

                    case 2:
                        Toast t = Toast.makeText(getApplicationContext(),datos[i], Toast.LENGTH_LONG);
                        t.show();
                        break;

                    case 3:
                        Toast te = Toast.makeText(getApplicationContext(),datos[i], Toast.LENGTH_LONG);
                        te.show();
                        break;

                    case 4:
                        Toast ti = Toast.makeText(getApplicationContext(),datos[i], Toast.LENGTH_LONG);
                        ti.show();
                        break;

                    case 5:
                        Toast tu = Toast.makeText(getApplicationContext(),datos[i], Toast.LENGTH_LONG);
                        tu.show();
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public void salir(View v) {
        finish();
    }

}


