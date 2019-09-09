package com.example.spinneranidados;


import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.lang.reflect.Array;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity  {


    Spinner spDepartamento,spProvincia,spDistrito;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spDepartamento=(Spinner)findViewById(R.id.spDepartamento);
        spProvincia=(Spinner)findViewById(R.id.spProvincia);
        spDistrito=(Spinner)findViewById(R.id.spDistrito);

        ArrayAdapter<CharSequence> adapter =  ArrayAdapter.createFromResource(getBaseContext(),
                R.array.array_departamento, android.R.layout.simple_list_item_1);
       // ArrayAdapter<String> ada = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, ItemsDepartamento);
        spDepartamento.setAdapter(adapter);
        spDepartamento.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int[] localidades ={R.array.array_amazonas,R.array.array_ancash,R.array.array_lima};
                ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(getBaseContext(), localidades[position],
                        android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spProvincia.setAdapter(adapter);

                spProvincia.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        int[] localidades1 ={R.array.array_distrito_lima,R.array.array_distrito_barranca,R.array.array_distrito_Cajatambo};
                        ArrayAdapter<CharSequence> adapter1 =  ArrayAdapter.createFromResource(getBaseContext(),
                                localidades1[position], android.R.layout.simple_list_item_1);
                        spDistrito.setAdapter(adapter1);

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }



//    int[] localidades1 ={R.array.array_distrito_lima,R.array.array_distrito_barranca,R.array.array_distrito_barranca};
//    ArrayAdapter<CharSequence>adapter1=ArrayAdapter.createFromResource(getBaseContext(), localidades1[position],
//            android.R.layout.simple_spinner_item);
//                        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//                        spDistrito.setAdapter(adapter1);

}
