package com.example.spinneranidados;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.lang.reflect.Array;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    Spinner spDepartamento,spProvincia,spDistrito;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spDepartamento=(Spinner)findViewById(R.id.spDepartamento);
        spProvincia=(Spinner)findViewById(R.id.spProvincia);
        spDistrito=(Spinner)findViewById(R.id.spDistrito);

        ArrayAdapter<CharSequence> adapter =  ArrayAdapter.createFromResource(this,
                R.array.array_departamento, android.R.layout.simple_list_item_1);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spDepartamento.setAdapter(adapter);
        spDepartamento.setOnItemSelectedListener(this);


    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        int[] localidades ={R.array.array_amazonas,R.array.array_ancash,R.array.array_lima};

        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this, localidades[position],
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spProvincia.setAdapter(adapter);





    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
