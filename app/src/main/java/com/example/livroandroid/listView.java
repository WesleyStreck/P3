package com.example.livroandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class listView extends AppCompatActivity {

    ListView lstResultados;
    EditText txtPesquisa;
    Button btnBuscar;
    String[] cidades = {"Riode Janeiro","Florianópolis","Curitiba","São Paulo"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

     txtPesquisa=(EditText)findViewById(R.id.txtPesquisa);
     btnBuscar=(Button)findViewById(R.id.btnBuscar);
     lstResultados=(ListView)findViewById(R.id.lstResultados);
    }

    public void btnBuscar_onClick(View v){
        String busca = txtPesquisa.getText().toString();
        List<String> encontradas = new ArrayList<>();
        for (String cidade : cidades){
            if (cidade.contains(busca))encontradas.add(cidade);
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getBaseContext(),android.R.layout.simple_list_item_1, encontradas);
        lstResultados.setAdapter(adapter);
    }
}
