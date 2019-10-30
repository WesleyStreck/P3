package com.example.livroandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class telaEstado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_estado);

        List<Estado> array = new ArrayList<>();
        ((ArrayList) array).add(new Estado("Rio Grande do Sul","RS"));
        ((ArrayList) array).add(new Estado("Santa Catarina","SC"));
        ((ArrayList) array).add(new Estado("Bala Perdida", "RJ"));

        ArrayAdapter<Estado> adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, array);
        final Spinner spinner = (Spinner)findViewById(R.id.spinner);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new Spinner.OnItemSelectedListener(){

            public void onItemSelected(AdapterView<?>parent, View view, int position, long id){
                Estado uf = (Estado)spinner.getSelectedItem();
                Toast.makeText(getBaseContext(),"UF selecionado: " + uf.getSigla(),Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?>parent){

            }
        });

    }
}
